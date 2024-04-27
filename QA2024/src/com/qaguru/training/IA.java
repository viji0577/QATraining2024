package com.qaguru.training;

public interface IA extends IB, IC {
	
	public abstract void method1(); //abstract method
	
	 void method2();	// even if public is not mentioned, it is public by default
	 void method3();   // by default it is abstract
	 void method4();
     void method5();

}
