package com.supplier.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TextEditOuterBean implements InitializingBean , DisposableBean{
	 private SpellCheckInnerBean spellChecker;
	   
	   // a setter method to inject the dependency.
	   public void setSpellChecker(SpellCheckInnerBean spellChecker) {
	      System.out.println("Inside setSpellChecker." );
	      this.spellChecker = spellChecker;
	   }
	   
	   // a getter method to return spellChecker
	   public SpellCheckInnerBean getSpellChecker() {
	      return spellChecker;
	   }
	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean Interface");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean interrface ");
	}
}
