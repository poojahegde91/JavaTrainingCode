package assignments;

public class Ass3_ConditionalStatements {

	public static void main(String[] args) {

		/*
		 * 1.Find out the greatest number out of three different given numbers: Input
		 * the 1st number: 25  Input the 2nd number: 78  Input the 3rd number: 87
		 * Expected Output : The greatest﻿: 87
		 */

		int a = 25, b = 78, c = 87;
		if (a > b && a > c) {
			System.out.println("The greatest: " + a);
		} else if (b > c) {
			System.out.println("The greatest: " + b);
		} else {
			System.out.println("The greatest: " + c);
		}

		/*
		 * Find out the greatest number out of four different given numbers: Input the
		 * 1st number: 25  Input the 2nd number: 78  Input the 3rd number: 87 Input the
		 * 4th number: 97 Expected Output : The greatest﻿: 97
		 */

		int l = 25, m = 78, n = 87, o = 97;

		if (l > m && l > n && l > o) {
			System.out.println("The greatest: " + l);
			;
		} else if (m > n && m > o) {
			System.out.println("The greatest: " + m);
		} else if (n > o) {
			System.out.println("The greatest: " + n);
		} else {
			System.out.println("The greatest: " + o);
		}

		/*
		 * 3. Write a Java program to test a number is positive or negative. Test Data
		 * Input number: 35 -- positive number Input number: -11 -- negative number
		 */

//		int p = 35; 
		int p = -11;

		if (p >= 0) {
			System.out.println("Positive number");
		} else {
			System.out.println("Negative number");
		}

		/* 4. WAP to check number is odd or even using If - Else */

		int number = 15;
		if (number % 2 == 0) {
			System.out.println("Number is even");
		} else {
			System.out.println("Number is odd");
		}

		/*
		 * 5. WAP to check given alphabet character is Vowel or Consonant using Switch -
		 * Case
		 */

		char ch = 'z';

		switch (ch) {
		case 'a': {
			System.out.println("The given alphabet is Vowel");
		}
			break;
		case 'e': {
			System.out.println("The given alphabet is Vowel");
		}
			break;
		case 'i': {
			System.out.println("The given alphabet is Vowel");
		}
			break;
		case 'o': {
			System.out.println("The given alphabet is Vowel");
		}
			break;
		case 'u': {
			System.out.println("The given alphabet is Vowel");
		}
			break;
		default:
			System.out.println("The given alphabet is Consonant");
			break;
		}

		/*
		 * 6.WAP to run your test cases in a specific environment like: QA, Stage, Dev,
		 * UAT, Prod using using Switch - Case
		 */

		String environment = "PROD ";

		switch (environment.toLowerCase().trim()) {
		case "qa": {
			System.out.println("Run your test case in QA environment");
		}
			break;
		case "stage": {
			System.out.println("Run your test case in Stage environment");
		}
			break;
		case "dev": {
			System.out.println("Run your test case in Dev environment");
		}
			break;
		case "uat": {
			System.out.println("Run your test case in UAT environment");
		}
			break;
		case "prod": {
			System.out.println("Run your test case in Prod environment");
		}
			break;

		default: {
			System.out.println("Please enter proper environment : " + environment);
		}
			break;
		}

		/*
		 * 7.WAP to book the specific type of car from the Uber app using Switch - Case.
		 * Car Type: Mini, Sedan, SUV, Premium If user passes wrong car type, print
		 * please select the right car type
		 */
		String carType = "MINI";

		switch (carType.toLowerCase().trim()) {
		case "mini": {
			System.out.println("Car type Mini is selected for booking");
		}
			break;
		case "sedan": {
			System.out.println("Car type Sedan is selected for booking");
		}
			break;
		case "suv": {
			System.out.println("Car type Suv is selected for booking");
		}
			break;
		case "premium": {
			System.out.println("Car type Premium is selected for booking");
		}
			break;
		default: {
			System.out.println("Please select the right car type: " + carType);
		}
			break;
		}

		/*
		 * 8.WAP to launch browsers using If-ElseIf and Switch Case. Browser:
		 * Chrome/Firefox/IE/Safari If user passes wrong browser, print please pass the
		 * right browser name
		 */

		// Using if else

		String browserName = "Firefox";
		browserName = browserName.toLowerCase().trim();

		if (browserName.equals("chrome")) {
			System.out.println("Chrome browser launched");
		} else if (browserName.equals("firefox")) {
			System.out.println("Firefox browser launched");
		} else if (browserName.equals("ie")) {
			System.out.println("IE browser launched");
		} else if (browserName.equals("safari")) {
			System.out.println("Safari browser launched");
		} else {
			System.out.println("Please pass the right browser name " + browserName);
		}

		// Using switch case

		String browser = "chrome";

		switch (browser.toLowerCase().trim()) {
		case "chrome": {
			System.out.println("Chrome browser launched");
		}
			break;
		case "firefox": {
			System.out.println("Firefox browser launched");
		}
			break;
		case "ie": {
			System.out.println("IE browser launched");
		}
			break;
		case "safari": {
			System.out.println("Safari browser launched");
		}
			break;
		default: {
			System.out.println("Please pass the right browser name " + browser);
		}
			break;
		}

		/*
		 * 9. WAP to define the interest rate on the basis of Loan type using Switch
		 * Case Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan For
		 * Housing Loan, if user’s salary is less than 35000 USD - print : NOT
		 * APPLICABLE FOR Housing Loan
		 */

		int salary = 34000;
		String loanType = "housingLoan";

		switch (loanType.toLowerCase().trim()) {
		case "carloan":
			System.out.println("Eligible: Apply for Car Loan");
			break;
		case "housingloan":
			if (salary >= 35000)
				System.out.println("Eligible: Apply for Housing Loan");
			else
				System.out.println("NOT APPLICABLE FOR Housing Loan");
			break;
		case "personalloan":
			System.out.println("Eligible: Apply for Car Loan");
			break;
		case "educationloan":
			System.out.println("Eligible: Apply for Car Loan");
			break;

		default:
			System.out.println("Selected loan type not available : " + loanType);
			break;
		}
	}

}
