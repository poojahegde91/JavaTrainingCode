package assignments;

public class Ass4_LoopsForWhile {

	public static void main(String[] args) {
		//1.WAP to print 100 times Naveen
		
		for(int i=0; i<=100; i++)
		{
			System.out.println(i +". Naveen");
		}
		int j=1;
		while(j<=100)
		{
			System.out.println(j + ".Naveen");
			j++;
		}
		
		
		//2. double, float, int, short, byte and char in while and for loop
		for(double k=1.01; k<=5.01; k++)
		{
			System.out.println(k);
		}
		
		for(float l=1.0f; l<=10.0f; l++)
		{
			System.out.println(l);
		}

		for (short m=1; m<=10; m++)
		{
			System.out.println(m);
		}
		
		for (byte n=1; n<=10; n++)
		{
			System.out.println(n);
		}
		
		for (char ch='A'; ch<='Z'; ch++)
		{
			System.out.println(ch);
			System.out.println(ch + ":" + (byte)ch);
		}
		
		int a=0;
		do {
			System.out.println("Value of a is :" + a);
			a++;
		} while (a<10);		
		
		
		/*
		 * 1. WAP to print following output: 
		 * I am Batman﻿ 
		 * I am Batman﻿ 
		 * I am Batman﻿ 
		 * I am Batman 
		 * I am Batman
		 */

		int count;
		for(count=1; count<=5; count++)
		{
			System.out.println("I am Batman");
		}
		
	/*	2. WAP to print following output:
			I am Batman 1
			I am Batman 2
			I am Batman 3
			I am Batman 4
			I am Batman 5
			I am Batman 6
			I am Batman 7
			I am Batman 8
			I am Batman 9 */
		
		int c;
		for(c=1; c<10; c++)
		{
			System.out.println("I am Batman " + c);
		}
		
		
		/* 3. WAP to print 10 to 1 using for, while and do-while loop */
		//for loop
		for(int i=10; i>0; i--)
		{
			System.out.println(i);
		}
		
		//while loop
		int m=10;
		while(m>0)
		{
			System.out.println(m);
			m--;
		}
		
		//do while loop
		
		int n=10;
		do {
			System.out.println(n);
			n--;
		} while (n>0);
		
		/*4. Write a program in Java to print "Hello World" ten times using while loop */
		
		int o=1;
		while(o<11)
		{
			System.out.println("Hello World");
			o++;
		}
		
		
		/*5. Write a program in Java to print all the multiplication of 5 from 1 to 100 using while /for/do-while loop */
		
		for(int s=1; s<=100; s++)
		{
			if(s%5==0)
			{
				System.out.println(s);
			}
		}
		
		int t=1;
		while (t<=100) {
			if(t%5==0)
			{
				System.out.println(t);
			}
			t++;
		}
		
		int u=1;
		do {
			if(u%5==0)
			{
				System.out.println(u);
			}
			u++;
		} while (u<=100);
		
		
		/*6. print all odd and even numbers between 1 to 100 */
		for(int x=1; x<=100; x++)
		{
			if(x%2==0)
			{
				System.out.println(x + " is even number");
			}
			
		}
		
		for(int y=1; y<=100; y++)
		{
			if(y%2!=0)
			{
				{
					System.out.println(y + " is odd number");
				}
			}
		}
		
	/*	7. What will be the output of this program:*/
		
		/*	int i = 1;
			while(i<=1){
			System.out.println("Hi Java");
			} */
		//Output is infinite loop - because the condition is always true
		
		/*8. Print A-Z , a-z, 0-9 with  the respective ASCII numbers the console one using while and for loop. */
		
		char ch ='A';
		while(ch<='Z')
		{
			System.out.println(ch +" : " + (byte)ch);
			ch++;
		}
		char ch1 = 'a';
		while(ch1<='z')
		{
			System.out.println(ch1 +" : " + (byte)ch1);
			ch1++;
		}
		
		char ch2 = '0';
		while(ch2<='9')
		{
			System.out.println(ch2 +" : " + (byte)ch2);
			ch2++;
		}
		
		for(char cr = 'a'; cr<= 'z'; cr++)
		{
			System.out.println(cr +" : " + (byte)cr);
		}
		for(char cr1 = 'A'; cr1<= 'Z'; cr1++)
		{
			System.out.println(cr1 +" : " + (byte)cr1);
		}
		
		for(char cr2 = '0'; cr2<= '9'; cr2++)
		{
			System.out.println(cr2 +" : " + (byte)cr2);
		}
		
		
		/*
		 * 9. Print the following series:  
		 * 1.0 2.0 3.0  ...... 10.0  
		 * 0 9 18 27 36 …99
		 */
		for(double l=1.0; l<=10.0; l++)
		{
			System.out.println(l + " ");
		}
		
		for(int z=0;z<=11; z++)
		{
			System.out.println(9*z);
		}
		
		
		/* 10 Print only vowels (aeiou) using for and while loop. Start the loop from ‘a‘ to ‘z‘. */
		
		for(char w='a'; w<='z'; w++)
		{
			if(w=='a' || w== 'e' || w=='i' || w=='o'||w=='u')
			{
				System.out.println(w);
			}
		}
		
		char aa = 'a';
		while(aa <= 'z')
		{
			if(aa=='a' || aa== 'e' || aa=='i' || aa=='o'||aa=='u')
			{
				System.out.println(aa);
			}
			aa++;
		}
		
		
		
		//11. Print 1 to 10 and break the loop once you find the multiplication of 7 with a message "bye, see you tomorrow".
		
		int g = 1;
		while (g<=10)
		{
			System.out.println(g);
			if(g%7==0)
			{
				System.out.println("bye, see you tomorrow");
				break;
			}
			g++;
		}
	}

}
