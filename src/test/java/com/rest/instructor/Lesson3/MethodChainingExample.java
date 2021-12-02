package com.rest.instructor.Lesson3;

public class MethodChainingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 5 
		a1().a2().a3();
		
		//Step 1:
		/*MethodChainingExample mc = new MethodChainingExample();*/
		
		//Step4 : remove above line and make all methods as static so that no object is needed to call the methods
		
		//Step 3 : call methods using chaining
		
	     /*mc.a1().a2().a3();*/
		
		/*  Step1
		mc.a1();
		mc.a2();
		mc.a3();*/
	}
	//Step 5
	
	public static MethodChainingExample a1()
	{
		System.out.println("this is a1 method");
		return new MethodChainingExample();
		
	}
	public static MethodChainingExample a2()
	{
		System.out.println("this is a2 method");
		return new MethodChainingExample();
	}

	public static MethodChainingExample a3()
	{
		System.out.println("this is a3 method");
		return new MethodChainingExample();
	}
	
	// Step 2: now for chaning let this methods return the class instead of void. and add this keyword
	
	/*public static MethodChainingExample a1()
	{
		System.out.println("this is a1 method");
		return this;
		
	}
	public static MethodChainingExample a2()
	{
		System.out.println("this is a2 method");
		return this;
	}

	public static MethodChainingExample a3()
	{
		System.out.println("this is a3 method");
		return this;
	}*/
	
	
	//Step1:Create methods
	/*public void a1()
	{
		System.out.println("this is a1 method");
		
	}
	public void a2()
	{
		System.out.println("this is a2 method");
		
	}

	public void a3()
	{
		System.out.println("this is a3 method");
		
	}*/

}
