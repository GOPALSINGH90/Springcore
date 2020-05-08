package com.supplier;

import java.util.Map;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.supplier.config.DataBaseConfig;
import com.supplier.domain.Account;
import com.supplier.domain.Client;
import com.supplier.domain.Customers;
import com.supplier.domain.PrototypeBean;
import com.supplier.domain.SingletonBean;
import com.supplier.domain.TextEditOuterBean;
import com.supplier.domain.Supplier;
import com.supplier.domain.User;
import com.supplier.servicelocator.ServiceLocator;

public class SupplierServiceApplication {

	public static void main(String[] args) {

		/*
		 * Spring Container and getting beans from the containers Service implementation
		 * getting the value
		 * 
		 */
		GenericApplicationContext context1 = new GenericApplicationContext();
		new XmlBeanDefinitionReader(context1).loadBeanDefinitions("services.xml", "daos.xml");
		context1.refresh();
		Supplier supplier2 = (Supplier) context1.getBean("supplier");
		System.out.println("product names are :  " + supplier2.getOrder().getProduct().getProductName());

		// Null or Empty String Values p:namespaces
		Customers customers = (Customers) context1.getBean("customer");
		System.out.println(customers.getId());
		System.out.println("Empty String check " + customers.getCustomerName().isEmpty());

		((AbstractApplicationContext) context1).close();

		// scope of beans
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		// Singleton scope every time it will return same object
		User user = (User) context.getBean("user");
		User user1 = (User) context.getBean("user");
		System.out.println("Singleton obejct " + (user == user1));

		// prototype beans every time it will return different object
		// using bean alias getting beans
		Account accountService = (Account) context.getBean("account-alias");
		Account accountService1 = (Account) context.getBean("account-alias");
		System.out.println("Prototype object " + (accountService == accountService1));

		// collections on dependency Injections
		Map<String, Integer> map = accountService.getAccounts();
		map.entrySet().stream().forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));

		// static factory method
		Client client = (Client) context.getBean("clientService");
		System.out.println(client.getClientName());

		// instance-factory-method
		ServiceLocator serviceLocator = (ServiceLocator) context.getBean("serviceLocator");
		System.out.println(serviceLocator.createAccountServiceInstance().getAccountDetails());

		// Outer and inner Beans
		TextEditOuterBean outerbean = (TextEditOuterBean) context.getBean("textEditOuterBean");
		outerbean.getSpellChecker().checkSpelling();
		context.close();

		// Database Configuration
		ApplicationContext dbcontext = new ClassPathXmlApplicationContext("dbconfig.xml");
		DataBaseConfig dataBaseConfig = (DataBaseConfig) dbcontext.getBean("dataBaseConfig");
		System.out.println("driver class name " + dataBaseConfig.getDriverClassName());

		// default Intilization and P:namespaces
		ApplicationContext lifeclyclebeancontext = new FileSystemXmlApplicationContext(
				"src/main/resources/default-lifecycleBean.xml");
		User userDetails = (User) lifeclyclebeancontext.getBean("user");
		System.out.println(" user Id : " + userDetails.getId() + " User Name :" + userDetails.getUserName());

		// application context aware and method injection
		ApplicationContext MethodInjectioncontext = new ClassPathXmlApplicationContext("beans.xml");
		SingletonBean singleton = (SingletonBean) MethodInjectioncontext.getBean("singletonBean");
		PrototypeBean prototypeBeanA = singleton.getPrototypeBean();
		PrototypeBean prototypeBeanB = singleton.getPrototypeBean();
		
		System.out.println("Is prototypeBeanA and prototypeBeanB  same ? " + (prototypeBeanA == prototypeBeanB));

	}

}
