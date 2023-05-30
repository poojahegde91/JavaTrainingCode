package javasessions;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;

		System.out.println(a[2]);
		// System.out.println(a[4]);//ArrayIndexOutOfBoundsException
		// System.out.println(a[-1]); //ArrayIndexOutOfBoundsException

		// find length
		int len = a.length;
		System.out.println(len);

		// Print all the values from the arry using for loop
		for (int k = 0; k < len; k++) {
			System.out.println(a[k]);
		}

		// whitout for loop
		System.out.println(a); // it will print the memory address [I@7c30a502

		System.out.println(Arrays.toString(a)); // output will be [10, 20, 30, 40]

		// Array literals
		int al[] = { 1, 2, 3, 4 };

		// directly assigning the values to the array

		// ArrayIndexOutOfBoundsException is a run time exception

		// Limitations of static array:
		// 1. Size is fixed - overcome with dynamic arrays
		// 2. same type of data has to be stored - overcome with Object array

		Object emp[] = new Object[4];

		emp[0] = "Pooja";
		emp[1] = 1234;
		emp[2] = "$1000";
		emp[3] = "Bangalore";

		System.out.println(Arrays.toString(emp));
		
		for(int e=0; e<emp.length; e++)
		{
			System.out.println(emp[e]);
		}
		
		//foreach loop or enhanced for loop
		System.out.println("-----------------------------");
		
		for(Object x : emp)
		{
			System.out.println(x);
		}
		//Time complexity of for each is O(n)

		//Print array a in the reverse order
		
		System.out.println("In order of Array a");
		System.out.println(Arrays.toString(a));
	
		System.out.println("In the reverse order of an array a");
		
		for(int y=a.length-1; y>=0;y--)
		{
			System.out.println(a[y]);
		}
	
	}

}
