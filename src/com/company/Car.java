package com.company;

public class Car {
	private String model;
	private int age;
	private String brand;

	public Car( String model, int age, String brand)
	{
		setModel(model);
		setAge(age);
		setBrand(brand);

	}
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getModel()
	{
		return this.model;
	}
	public void setAge( int age)
	{
		this.age = age >= 2011 && age<=2021? age: -1;
	}
	public  int getAge()
	{
		return this.age;
	}
	public void setBrand(String brand)
	{  brand = brand.strip();
		this.brand = brand.toUpperCase();
	}
	public String getBrand()
	{
		return this.brand;
	}
	public String toString()
	{
		return "\n Brand: "+getBrand()+"\n Year: "+getAge()+"\n Model: " + getModel();
	}

}
