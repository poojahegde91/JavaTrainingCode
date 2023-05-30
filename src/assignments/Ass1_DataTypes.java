package assignments;

public class Ass1_DataTypes {

	public static void main(String[] args) {
		
		/*1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
		Expected Output :
		Hello
		Naveen K
		 */
		
		System.out.println("Hello\nPooja Hegde");
		
		/* 2. Write a Java program to print the sum of two numbers.
		Test Data:
		 74 + 36 
		Expected Output:
		110 */
		
		int number1, number2, sum;
		
		number1 =74;
		number2 =36;
		sum = number1 + number2;
		
		System.out.println(sum);
		
		/* 3. Write a Java program to divide two numbers and print on the screen.
		 * Test Data:
		 * 50/3
		 * Expected 
		 * 16 */
		
		int number3, number4, sum1;
		
		number3 =50; 
		number4 = 3;
		sum1=number3/number4;
		
		System.out.println(sum1);
		
		/*
		 * 5. Write a Java program to compute the specified expressions and print the output. 
		 * Go to the editor Test Data: ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))  
		 * Expected Output 2.138888888888889
		 */
		
		double sum2;
		
		sum2 = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		
		System.out.println(sum2);
		
		/*6. Try to concat "Hello Selenium" with a character 't'. */
		
		String s = "Hello Selenium";
		char c ='t' ;
		
		System.out.println(s+c);
		
		/*7. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
		 * "Your Total amount is. 3700".*/
		
		int add, num1, num2, num3;
		num1 =100;
		num2 =200;
		num3 =3400;
		
		add = num1 + num2+ num3;
		
		System.out.println("\""+"Your Total amount is. " + add + "\"" );
		
		/*8 Print the ASCII value of the character 'h'. */
		
		System.out.println((byte)'h');
		
		
		/*9 Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.*/
		
		int num4 = 3;
		char ch = 'd';
		
		int num5 = num4+ch;
		System.out.println((char)num5);
		
		/* Write a program to find the square of the number 3.9.*/
		
		float n = 3.9f;
		
		float result = n*n;
		
		System.out.println(result);
		
	}

}
