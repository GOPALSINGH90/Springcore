package com.supplier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.supplier.config.AppConfig;
import com.supplier.domain.Product;
import com.supplier.domain.Supplier;
import com.supplier.domain.User;
import com.supplier.repository.FortuneService;
import com.supplier.service.MyService;
import com.supplier.serviceimpl.MyServiceImpl;

public class SupplierServiceApplication {

	public static void main(String[] args) {
 
		// from Spring Container getting beans using annotation and XML configuration 
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		// getting the beans Using annotation
		Product product = (Product) context.getBean("productAnn");
		product.setId(100L);
		product.setProductName("Adidas");
		System.out.println(product.getAnnotationProduct());

		Supplier supplier = (Supplier) context.getBean("supplierAnnotation");
		System.out.println("product Name " + supplier.getOrder().getProductAnn().getProductName());

		FortuneService fortuneService = (FortuneService) context.getBean("happyFortune");
		System.out.println("Fortune service :=  " + fortuneService.getFortuneService());
		context.close();

		
		// from Spring Container getting beans using annotation and java based configuration
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MyService myService = ctx.getBean(MyServiceImpl.class);
		myService.javaBasedBean();
		
		User  user =  ctx.getBean(User.class);
		user.setUserName("Gopal Singh");
		System.out.println(user.getUserName());

	}

}
