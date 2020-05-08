package com.supplier.domain;

public class TextEditOuterBean {
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
}
