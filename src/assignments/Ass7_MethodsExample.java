package assignments;

public class Ass7_MethodsExample {

	public int studentMarks(String studentName) {
		int marks = -1;
		
		switch (studentName) {
		case "Pooja":
			marks = 100;
			System.out.println("Getting marks for " + studentName);
			break;
		case "Pavana":
			marks = 90;
			System.out.println("Getting marks for " + studentName);
			break;
		case "Bhavana":
			marks = 80;
			System.out.println("Getting marks for " + studentName);
			break;
		case "Rashmi":
			marks = 70;
			System.out.println("Getting marks for " + studentName);
			break;
		case "Shruti":
			marks = 0;
			System.out.println("Getting marks for " + studentName);
			break;
		default:
			System.out.println("No student found, Please enter valid student name -- " + studentName);
			break;
		}

		return marks;
	}

	public static void main(String[] args) {
		Ass7_MethodsExample obj = new Ass7_MethodsExample();
		
		int getMarks = obj.studentMarks("Shreuti");
		System.out.println(getMarks);
		if(getMarks>=0)
		{
			System.out.println("Print the marks card");
		}
		else
		{
			System.out.println("No Marks card to print");
		}
		
	}

}
