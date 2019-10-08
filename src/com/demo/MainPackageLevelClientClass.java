package com.demo;

public class MainPackageLevelClientClass {
	
	public static void main(String [] args) {
		MainPackageLevelClass mplc = new MainPackageLevelClass();
		System.out.println(mplc.mainPackageLevelClassMethod());
	}

}
