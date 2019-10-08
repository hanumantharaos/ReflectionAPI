package com.demo.test;

import com.demo.MainPackageLevelClass;

public class SubPackageLevelClientClass extends MainPackageLevelClass{

	public static void main(String[] args) {
		
		MainPackageLevelClass mplc = new MainPackageLevelClass();
		System.out.println(mplc.mainPackageLevelClassMethod());

	}

}
