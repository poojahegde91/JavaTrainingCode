package javasessions;

public class MethodsInJava {

	// 1. no input no return

	public void test() {
		System.out.println("No input No return method");
	}

	// 2. No input but some return

	public int getNumber() {
		int a = 15;
		return a;
	}
	
	public String getTrainerName()
	{
		String name = "Naveen";
		return name;
	}
	
	public char getASCIIValue()
	{
		char ch = 'A';
		return ch;
	}
	
	//3. input something and return something
	
	public int sumNumbers(int a, int b)
	{
		int sum = a+b;
		return sum;
	}

	public static void main(String[] args) {
		MethodsInJava obj = new MethodsInJava();
		obj.test();

		int getNum = obj.getNumber();
		System.out.println("No input but some return method " + getNum);
		
		String getTname = obj.getTrainerName();
		System.out.println("Trainer name is " + getTname);
		
		char getValue = obj.getASCIIValue();
		System.out.println((byte)getValue);
		
		int total = obj.sumNumbers(30, 40);
		System.out.println(total);
				
	}

}
