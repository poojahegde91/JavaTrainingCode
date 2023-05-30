package assignments;

public class Ass2_IncrementDecrement {

	public static void main(String[] args) {

		/*
		 * 1) What will be the output of the following program? public class
		 * IncrementDecrementQuiz { public static void main(String[] args) { int i = 11;
		 * 
		 * i = i++ + ++i;
		 * 
		 * System.out.println(i); } }
		 */

		int i = 11;

		i = i++ + ++i; // 11+13

		System.out.println(i); // 24

		/*
		 * 2) Guess the output of the following program? public class
		 * IncrementDecrementQuiz { public static void main(String[] args) { int a=11,
		 * b=22, c;
		 * 
		 * c = a + b + a++ + b++ + ++a + ++b; // 11+22+11+22+13+24 =103
		 * 
		 * System.out.println("a="+a); //13 System.out.println("b="+b);//24
		 * System.out.println("c="+c); } }//103
		 */

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		/*
		 * 3) What will be the output of the below program? public class
		 * IncrementDecrementQuiz * { *     public static void main(String[] args) *
		 *     { *         int i=0; *           *         i = i++ - --i + ++i - i--;
		 * //0-0+1-1=0             System.out.println(i); //0 *     } * }
		 */

		int j = 0;
		j = j++ - --j + ++j - j--;
		System.out.println(j);

		/*
		 * 4) Is the below program written correctly?
		 * 
		 * public class IncrementDecrementQuiz
		 * 
		 * {
		 * 		 *     public static void main(String[] args)
		 * 
		 *     {
		 * 		 *         boolean b = true; //1
		 *        b++;
			 System.out.println(b);//2
		 * 
		 *     }}
		 */
		
		// WE CANNOT DO THE INCREMENT OPERATION ON BOOLEAN TYPE	
		
		/*
		 * 5) What will be the output of the below program?
		 * 
		 * public class IncrementDecrementQuiz
		 * 
		 * {
		 * 
		 *     public static void main(String[] args)
		 * 
		 *     {
		 *         int i=1, j=2, k=3;
		 *         int m = i-- - j-- - k--; //1 -2 -3 =-4
		 *         System.out.println("i="+i); 0
		 *         System.out.println("j="+j);1
		 *         System.out.println("k="+k);2
		 *         System.out.println("m="+m); -4
		 *     }
		 * }
		 */		
		
		int X=1, Y=2, Z=3;
		int m = X-- - Y-- - Z--;
		System.out.println("X="+X);
		System.out.println("Y="+Y);
		System.out.println("Z="+Z);
		System.out.println("m="+m);
		/*
		 * 6) What will be the output of the following program?
		 * 
		 * public class IncrementDecrementQuiz
		 * 
		 * {
		 * 
		 *     public static void main(String[] args)
		 * 
		 *     {
		 * 
		 *         int a=1, b=2;
		 * 
		 *          
		 * 
		 *         System.out.println(--b - ++a + ++b - --a); //1 -2 + 2-1 = 0
		 * 
		 *     }
		 * 
		 * }
		 */
		
		int s=1, q=2;
		System.out.println(--q - ++s + ++q - --s);
		
		
		/*
		 * 7) What will be the value of i, j and k in the below program?
		 * 
		 * public class IncrementDecrementQuiz
		 * 
		 * {
		 * 
		 *     public static void main(String[] args)
		 * 
		 *     {
		 * 
		 *         int i=19, j=29, k;
		 * 
		 *          
		 * 
		 *         k = i-- - i++ + --j - ++j + --i - j-- + ++i - j++; 
		 * //		19 -18(i =19) + 28 -29(j=29) +18- 29(j=28) + 19 -28
		 *          
		 * 
		 *         System.out.println("i="+i); 19
		 * 
		 *         System.out.println("j="+j); 29
		 * 
		 *         System.out.println("k="+k); -20
		 * 
		 *     }
		 * 
		 * }
		 */	
		
		int u=19, v=29, w;
		w = u-- - u++ + --v - ++v + --u - v-- + ++u - v++;
		
		System.out.println("u="+u);
		System.out.println("v="+v);
		System.out.println("w="+w);
		
		
		/*
		 * 8) What is wrong with the below program? Why it is showing compilation error?
		 * 
		 * public class IncrementDecrementQuiz
		 * 
		 * {
		 * 
		 *     public static void main(String[] args)
		 * 
		 *     {
		 * 
		 *         int i = 11;
		 * 
		 *          
		 * 
		 *         int j = --(i++);
		 * 
		 *     }
		 * 
		 * }
		 */
		
		//int d =11;
		//int l = --(d++);
		
		//invalid operation
		
		/*
		 * 9) Guess the value of p in the below program?
		 * 
		 * public class IncrementDecrementQuiz
		 * 
		 * {
		 * 
		 *     public static void main(String[] args)
		 * 
		 *     {
		 * 
		 *         int m = 0, n = 0;
	
		 *         int p = --m * --n * n-- * m--;
		 * 			//-1 * -1 * -1 * -1
		 *          
		 * 
		 *         System.out.println(p); //1
		 * 
		 *     }
		 * 
		 * }
		 */		
		
		int ma =0, na =0;
		
		int pa = --ma * --na * na-- * ma--;
		 System.out.println(pa);
		 
		 
			/*
			 * 10) What will be the output of the following program?
			 * 
			 * public class IncrementDecrementQuiz
			 * 
			 * {
			 * 
			 *     public static void main(String[] args)
			 * 
			 *     {
			 * 
			 *         int a=1;
			 * 
			 *          
			 * 
			 *         a = a++ + ++a * --a - a--;
			 *				  
			 *          
			 * 
			 *         System.out.println(a); 
			 * 
			 *     }
			 * 
			 * }
			 */		
		 		int aa = 1;
		 		aa = aa++  + ++aa * --aa - aa--; // 1 + 3 *2 -2 = 1+6 - 2 = 5
		 		System.out.println(aa);
		 		
				/*
				 * 11) What will be the outcome of the below program?
				 * 
				 * public class IncrementDecrementQuiz
				 * 
				 * {
				 * 
				 *     public static void main(String[] args)
				 * 
				 *     {
				 * 
				 *         int a = 11++;
				 * 
				 *          
				 * 
				 *         System.out.println(a);
				 * 
				 *     }
				 * 
				 * }
				 */

		 	//	int ab = 11++;
		 	//	System.out.println(ab);
		 		
		 		//invalid opration on int ab
		 		
				/*
				 * 12) What will be the outcome of the below program?
				 * 
				 * public class JavaIncrementDecrementQuiz
				 * 
				 * {
				 * 
				 *     public static void main(String[] args)
				 * 
				 *     {
				 * 
				 *         int ch = 'A';
				 * 
				 *          
				 * 
				 *         System.out.println(ch++);
				 * 
				 *     }
				 * 
				 * }
				 */
		 		
		 		int ah = 'A';
		 		System.out.println(ah++); //65 increment will happen later
		 		
		 		
				/*
				 * 13) What will be the outcome of the below program?
				 * 
				 * public class JavaIncrementDecrementQuiz
				 * 
				 * {
				 * 
				 * public static void main(String[] args)
				 * 
				 * {
				 * 
				 * char ch = 'A';
				 * 
				 * 
				 * 
				 * System.out.println(++ch);
				 * 
				 * }
				 * 
				 * }
				 */
		 		char bh = 'A';
		 		System.out.println(++bh); //depends on the type
		 		
				/*
				 * 14) What will be the outcome of the below program?
				 * 
				 * public class JavaIncrementDecrementQuiz
				 * 
				 * {
				 * 
				 *     public static void main(String[] args)
				 * 
				 *     {
				 * 
				 *         double d = 1.5, D = 2.5;
				 * 
				 *          
				 * 
				 *         System.out.println(d++ + ++D);
				 * 
				 *     }
				 * 
				 * }
				 */
		 		
		 		double dd = 1.5, DD=2.5;
		 		
		 		System.out.println(dd++ + ++DD); //1.5 + 3.5 = 5.0
	}

}
