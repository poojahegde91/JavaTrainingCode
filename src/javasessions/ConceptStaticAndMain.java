package javasessions;

public class ConceptStaticAndMain {

	public static void main(String[] args) {
		System.out.println("inside main");
		for(int i=0; i<=3; i++)
		{
			for(int j=0; j<=4; j++)
			{
				System.out.print(i+""+j+ " ");
			}
			System.out.println();
		}
		
		byte s = 065;
		System.out.println(s);
	}
	
	static {
		System.out.println("inside static 1");
		System.out.println("inside static 1");
		int s= 10;
		System.out.println(s);
	}
	
	static {
		System.out.println("inside static 2");
		System.out.println("inside static 2");
		int s= 110;
		System.out.println(s);
	}

	
}
