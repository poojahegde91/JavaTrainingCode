package javasessions;

public class TimeComplexity {

	public static void main(String[] args) {
		//nested loop
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4;j++)
			{
				System.out.print(i +"" + j + " ");
			}
			System.out.println();
		}
		
		
		byte b1 =100;
		byte b2 = 90;
		//byte b3 = b1+b2; // giving error because out of range
		byte b8 = (byte) (b1+b2); // some garbage number will be displayed
		
		byte b4 = 10; 
		byte b5 =90;
	//	byte b6=b4+b5; //it comes in the range still it gives error because java knows later if you cange number of b4 or b5
		//so result should be stored in int
		int b7 = b4+b5;
	}

}
