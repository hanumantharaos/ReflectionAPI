package in.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestDefaultPackageLevelClass {
	
	public static void main(String [] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		
	Class <?> clazz = Class.forName("com.demo.MainPackageLevelClass");
	//Object object = clazz.newInstance();
	
	
	// Start of Get All the methods from a class
		/*
		 * Method[] methods = clazz.getDeclaredMethods();
		 * 
		 * 
		 * for(Method method : methods) { method.setAccessible(true);
		 * System.out.println(method.invoke(object, null)); }// End of Get All methods
		 * from a class
		 */
	
	// Start of Get a Single method from a class
	
	Constructor<?> constructor = clazz.getDeclaredConstructor();
	
	constructor.setAccessible(true);
	Object object = constructor.newInstance();
		Method method = clazz.getDeclaredMethod("mainPackageLevelClassMethod", null);
		method.setAccessible(true);
		System.out.println(method.invoke(object, null));
		
		Method method1 = clazz.getDeclaredMethod("mainPackageLevelClassMethod", String.class);
		method1.setAccessible(true);
		System.out.println(method1.invoke(object, "Argument"));
	
	} 
	
	
	

}
