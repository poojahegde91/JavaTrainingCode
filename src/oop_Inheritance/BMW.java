package oop_Inheritance;

public class BMW extends Car{

	@Override
	public void start()
	{
		System.out.println("BMW --- start method");
	}
	
	public void autoshift()
	{
		System.out.println("BMW --- autoshift method");
	}
	
	public void antiBreaking()
	{
		System.out.println("BMW --- antiBreaking method");
	}
	
	@Override
	public void engine()
	{
		System.out.println("BMW --- engine method");
	}
}
