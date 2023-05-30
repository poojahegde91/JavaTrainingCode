package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ass5_ArrayArrayList {

	public static void main(String[] args) {

		// Static Arrays

		String browsers[] = { "Chrome", "Firefox", "IE", "Safari", "Opera" };

		System.out.println(Arrays.toString(browsers));

		// using switch case
		for (int i = 0; i < browsers.length; i++) {
			System.out.println(browsers[i]);
			switch (browsers[i]) {
			case "Chrome":
				System.out.println("From Google");
				break;
			case "Firefox":
				System.out.println("From Mozilla");
				break;
			case "IE":
				System.out.println("From Microsoft");
				break;
			case "Safari":
				System.out.println("From Apple");
				break;
			case "Opera":
				System.out.println("From Oracle");
				break;
			default:
				break;
			}
		}

		// using for loop

		for (int j = 0; j < browsers.length; j++) {
			System.out.println(browsers[j]);
			if (browsers[j].equals("Chrome")) {
				System.out.println("From Google");
			} else if (browsers[j].equals("Firefox")) {
				System.out.println("From Mozilla");
			} else if (browsers[j].equals("IE")) {
				System.out.println("From Microsoft");
			} else if (browsers[j].equals("Safari")) {
				System.out.println("From Apple");
			} else if (browsers[j].equals("Opera")) {
				System.out.println("From Oracle");
			}

		}

		System.out.println("********************************************************");

//		Q1: WAP to delete a specific number from the given array.
//		int p[] = {1,4,5,2,3,22,31, 2}; 
//		--Need to remove 22 from the p[] array.
//		--output should be: [1, 4, 5, 2, 3, 31, 2]

		System.out.println("Q1: WAP to delete a specific number from the given array.");

		// As this is a static array we cannot remove specific number from the array
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };

		System.out.println("Origianal Array " + Arrays.toString(p));
		
		
		
		

		int removeIndex = 5;

		for (int i = removeIndex; i < p.length - 1; i++) {
			p[i] = p[i + 1];
		}

		System.out.println("After removal " + Arrays.toString(p));
		// We cannot alter the size of an array , after the removal,
		// the last and second last element in the array will exist twice

		//  Q2: Write a program to create a static Array, having following cricket data:
		// name, age, team name, DOB, gender, Strike Rate
		// Try to create multiple Object Arrays for different players 
		// Try to print all the values of each player on the console

		System.out.println(
				"Q2: Write a program to create a static Array, having following cricket data: name, age, team name, DOB, gender, Strike Rate");

		Object cricketPlayers[] = new Object[6];
		cricketPlayers[0] = "Sachin";
		cricketPlayers[1] = 40;
		cricketPlayers[2] = "MI";
		cricketPlayers[3] = "01-01-1983";
		cricketPlayers[4] = 'M';
		cricketPlayers[5] = 205;

		System.out.println(Arrays.toString(cricketPlayers));

		Object cricketPlayers1[] = { "Kohli", 35, "RCB", "01-01-1988", 'M', 198 };
		System.out.println(Arrays.toString(cricketPlayers1));

		Object cricketPlayers2[] = { "KL Rahul", 30, "RCB", "01-01-1993", 'M', 250 };
		System.out.println(Arrays.toString(cricketPlayers2));

		// *    1. Write a Java program to create a new array list,
		// add some colors (string)
		// and print out the colorslist.

		System.out.println("----------new array list with colors-------------");
		ArrayList<String> colorsList = new ArrayList<String>();
		colorsList.add("Red");
		colorsList.add("Yellow");
		colorsList.add("Blue");
		colorsList.add("White");

		System.out.println(colorsList);

		// 2. Write a Java program to insert an element into the array list at the first
		// and last positions.

		System.out.println("Original ArrayList --- " + colorsList);
		System.out.println("Size of Arraylist --- " + colorsList.size());

		colorsList.add(0, "Black");
		System.out.println("New color added to first position --- " + colorsList);
		System.out.println("Size of Arraylist --- " + colorsList.size());

		colorsList.add(colorsList.size(), "Green");
		System.out.println("New color added to Last position --- " + colorsList);
		System.out.println("Size of Arraylist --- " + colorsList.size());

		// 3. Write a Java program to retrieve an element at a specified index from a
		// given array list.

		System.out.println(colorsList.get(5));

		// 4. Write a Java program to update specific array element by given element.
		colorsList.set(4, "Pink");
		System.out.println("New color updated to white color position --- " + colorsList);

		// 5. Write a Java program to remove the third element from an array list.
		colorsList.remove(3);
		System.out.println("After removing 3rd position element --- " + colorsList);

		// 6. Write a Java program to search an element in an array list using for loop.
		// Once we find that element, break the loop.

		for (int i = 0; i < colorsList.size(); i++) {
			if (colorsList.get(i).equals("Pink")) {
				break;
			}
			System.out.println(colorsList.get(i));
		}

		// 7. Reverse this array List:

		ArrayList<String> studentNames = new ArrayList<String>();
		studentNames.add("Varun");
		studentNames.add("Reena");
		studentNames.add("Naveen");
		studentNames.add("Robin");
		studentNames.add("Peter");

		System.out.println("ArrayList before sorting ----- " + studentNames);
		Collections.sort(studentNames);
		
		System.out.println("ArrayList After sorting --------" + studentNames);
		Collections.reverse(studentNames);
		
		System.out.println("ArrayList After reversing --------" + studentNames);
		
		//8. Write a Java program to extract a portion of an array list.
		
		System.out.println("Original ArrayList---- " + studentNames);
		
		List<String> subListofArray = studentNames.subList(1, 3);
		
		System.out.println("Extracting portion of an arrylist ---- " + subListofArray);
		
		
		//9. Write a Java program to empty an array list.
		
		studentNames.removeAll(studentNames);
		
		System.out.println(studentNames.size());
		
		//OR
		
		colorsList.clear();
		System.out.println(colorsList.size());
		
		//Write a Java program to trim the virtual capacity of an array list the current list size.
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		numList.add(500);
		
		System.out.println(numList);
		numList.trimToSize();
		System.out.println(numList);
		
		
		//11. Write a Java program to print all the elements of an ArrayList using the position of the elements
		
		for(int i=0; i<numList.size(); i++)
		{
			System.out.println(i +"------"+ numList.get(i));
		}
		
	}

}
