package com.demo;

 class MainPackageLevelClass {
	
	/*
	 * public MainPackageLevelClass() {
	 * 
	 * }
	 */
	 
	 private MainPackageLevelClass() {
		 
	 }
	
	protected String mainPackageLevelClassMethod() {
		
		return "Main Package Level Class Method String";
	}
	
   protected String mainPackageLevelClassMethod(String argument) {
		
		return "Main Package Level Class Method String"+argument;
	}
	
	

}
