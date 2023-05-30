package assignments;

public class Ass9_Methods {

	public int arithmeticLogic(String action, int a, int b) {
		int result = 0;

		if (action.equalsIgnoreCase("Addition")) {
			result = a + b;
		} else if (action.equalsIgnoreCase("Subtraction")) {
			result = a - b;
		} else if (action.equalsIgnoreCase("Multiplication")) {
			result = a * b;
		} else if (action.equalsIgnoreCase("Division")) {
			result = a / b;
		}
		return result;
	}

	public double product(double x, double y) {
		double result = 0.0;
		result = x * y;
		return result;

	}

	public double circumference(String finding, double r) {
		double cm = 0.0;
		if (finding.equalsIgnoreCase("circumference")) {
			cm = 2 * 3.142 * r;
		} else if (finding.equalsIgnoreCase("area")) {
			cm = 3.142 * r * r;
		}
		return cm;
	}

	public int maxNumber(int m, int n, int p) {
		int maxnum = m;
		if (m > n && m > p) {
			maxnum = m;
		} else if (n > p) {
			maxnum = n;
		} else {
			maxnum = p;
		}

		return maxnum;
	}

	public int minNumber(int m, int n, int p) {
		int minnum = m;
		if (m < n && m < p) {
			minnum = m;
		} else if (n < p) {
			minnum = n;
		} else {
			minnum = p;
		}
		return minnum;
	}

	public boolean oddOrEvenNum(int num) {
		boolean isEven = false;
		if (num % 2 == 0) {
			isEven = true;
		}
		return isEven;
	}

	public boolean eligibility(int num) {
		boolean isEligible = false;
		if (num >= 18) {
			isEligible = true;
		}
		return isEligible;
	}

	public String gradeOfStudent(int marks) {
		String grade = null;

		if (marks >= 91 & marks <= 100) {
			grade = "AA";
		} else if (marks >= 81 & marks <= 90) {
			grade = "AB";
		} else if (marks >= 71 & marks <= 80) {
			grade = "BB";
		} else if (marks >= 61 & marks <= 70) {
			grade = "BC";
		} else if (marks >= 51 & marks <= 60) {
			grade = "CD";
		} else if (marks >= 41 & marks <= 50) {
			grade = "DD";
		} else if (marks >= 0 & marks <= 40) {
			grade = "Fail";
		} else {
			System.out.println("Enter valid marks");
		}

		return grade;

	}

	public int factorial(int f) {
		int fact = 1;
		if (f != 0) {
			for (int i = 1; i <= f; i++) {
				fact = fact * i;
			}
		}
		else {
			fact=0;
		}
		System.out.println(f);
		return fact;
	}

	public static void main(String[] args) {

		// 1.Write a program to print the addition/subtraction/division/multiplication
		// of two numbers entered by user by defining your own method
		Ass9_Methods obj = new Ass9_Methods();

		int sum = obj.arithmeticLogic("addition", 20, 30);
		System.out.println("Sum of 2 numbers is -- " + sum);

		int sub = obj.arithmeticLogic("Subtraction", 50, 10);
		System.out.println("Substraction of 2 numbers is --- " + sub);

		int mul = obj.arithmeticLogic("Multiplication", 20, 30);
		System.out.println("Multiplication of 2 numbers is -- " + mul);

		int div = obj.arithmeticLogic("Division", 50, 10);
		System.out.println("Division of 2 numbers is --- " + div);

		// 2. Define a method that returns the product of two double numbers entered by
		// user.
		double finalOutput = obj.product(52.8, 79.3);
		System.out.println("The product of two double numbers == " + finalOutput);

		// 3.Write a program to print the circumference and area of a circle of radius
		// entered by user by defining your own method. 

		double cmOfCircle = obj.circumference("circumference", 5.2);
		System.out.println("circumference of a circle is ---" + cmOfCircle);

		double areaOfCircle = obj.circumference("area", 5.2);
		System.out.println("Area of a circle is ---" + areaOfCircle);

		// 4. Define two methods to print the maximum and the minimum number
		// respectively among three numbers entered by user.
		int maximum = obj.maxNumber(100, 150, 92);
		System.out.println("max of 3 numbers is -- " + maximum);

		int minimum = obj.minNumber(100, 150, 92);
		System.out.println("min of 3 numbers is -- " + minimum);

		// 5. Def﻿ine a program to find out whether a given number is even or odd -
		// return true/false.

		boolean isEvenNumber = obj.oddOrEvenNum(53);
		if (isEvenNumber == true) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is Odd");
		}

		/*
		 * 6. A person is eligible to vote if his/her age is greater than or equal to
		 * 18. Define a method to find out if he/she is eligible to﻿ vote. - return
		 * true/false
		 */
		boolean isEligible = obj.eligibility(13);
		if (isEligible == true) {
			System.out.println("A person is eligible to vote");
		} else {
			System.out.println("A person is not eligible to vote");
		}

		/*
		 * 7. Write a program which will ask the user to enter his/her marks (out of
		 * 100). Define a method that will display grades according to the marks entered
		 * as below: Marks        Grade 91-100         AA 81-90          AB
		 * 71-80          BB 61-70          BC 51-60          CD 41-50          DD
		 * <=40          Fail
		 */
		String grade = obj.gradeOfStudent(100);
		System.out.println("Student grade is -- " + grade);

		/*
		 * 8. Write a program to print the factorial of a number by defining a method
		 * named 'Factorial'. Factorial of any number n is represente﻿d by n! and is
		 * equal to 1*2*3*....*(n-1)*n. E.g.- 4! = 1*2*3*4 = 24 3! = 3*2*1 = 6 2! = 2*1
		 * = 2 Also, 1! = 1 0! = 0
		 */

		int fact = obj.factorial(10);
		System.out.println("Factorial is = " + fact);
	}

}

