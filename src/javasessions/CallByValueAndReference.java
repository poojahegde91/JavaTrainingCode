package javasessions;

public class CallByValueAndReference {

	String name;
	int age;
	
	public void sum(int a, int b)
	{
		System.out.println("Sum is = " + a+b);
	}
	
	public void getEmpObj(CallByValueAndReference ob)
	{
		ob.name = "Pooja";
		ob.age = 25;
		
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
	}
	
	public static void main(String[] args) {
		
		 CallByValueAndReference obj = new CallByValueAndReference();
		 obj.sum(30,20); //call by value
		 
		 obj.getEmpObj(obj);
		 
		 
		 

	}

}
