package com.assignment.privateaccess;

public class PrivateClass {
	private void privateMethod() {
	        System.out.println("It is a private method.");
	    }

	    public void callPrivateMethod() {
	        privateMethod(); 
	    }
	}


