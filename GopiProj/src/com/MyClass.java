package com;

public class MyClass {

	public static void main(String[] args) {
		CC[] a=new CC[8];
		a[0]=new CC();
		System.out.println(a.length);
		System.out.println(a[0].getString());
		System.out.println(a[0].getStrings());

	}

}
