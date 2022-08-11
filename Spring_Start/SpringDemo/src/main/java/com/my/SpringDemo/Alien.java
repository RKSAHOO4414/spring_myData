package com.my.SpringDemo;

public class Alien {
	
	private int age;
	//private Laptop laptop;
	private Computer com;
	
	public Computer getCom() {
		return com;
	}

	public void setCom(Computer com) {
		this.com = com;
	}

	public Alien() { 
		System.out.println("Alien Object Created..."); 
	}
	
	public Alien(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		System.out.println("Age Assigned");
		this.age = age;
	}

	public void code() {
		System.out.println("I am coeing...");
		com.compile();
	}

	/*
	 * public Laptop getLaptop() { return laptop; }
	 * 
	 * public void setLaptop(Laptop laptop) { this.laptop = laptop; }
	 */
	
}
