package assignments;

import java.util.ArrayList;

public class Ass8_ArraylistMethodExample {

	public ArrayList<String> employeeList(String companyName) {
		System.out.println("Company is --- " + companyName);
		ArrayList<String> empList = new ArrayList<String>();

		if (companyName.trim().equalsIgnoreCase("IBM")) {
			empList.add("Tarun");
			empList.add("Varun");
			empList.add("Tara");
			empList.add("Bunny");
			empList.add("Suvetha");
			empList.add("Ambi");
		} else if (companyName.trim().equalsIgnoreCase("Wipro")) {
			empList.add("Meena");
			empList.add("Heena");
			empList.add("Pavani");
			empList.add("Kalyani");			
		} else if (companyName.trim().equalsIgnoreCase("Infosys")) {
			empList.add("Tom");
			empList.add("Ram");
			empList.add("Shashi");
			empList.add("Sudhee");		
			empList.add("Vivek");
			empList.add("Anusha");	
			empList.add("Ankush");
			empList.add("Vidya");	
		}else if (companyName.trim().equalsIgnoreCase("Google")) {
			empList.add("Tarun");
			empList.add("Varun");
			empList.add("Tara");
			empList.add("Suvetha");
			empList.add("Ambi");
		} else if (companyName.trim().equalsIgnoreCase("EY")) {
			empList.add("Meena");
			empList.add("Heena");			
		} else if (companyName.trim().equalsIgnoreCase("HTC")) {
			empList.add("Tom");
			empList.add("Ram");
			empList.add("Shashi");
			empList.add("Sudhee");		
			empList.add("Vivek");
			empList.add("Anusha");	
			empList.add("Ankush");
		} else if (companyName.trim().equalsIgnoreCase("Sony")) {
			empList.add("Meena");
			empList.add("Heena");
			empList.add("Sudhee");		
			empList.add("Vivek");
		} else if (companyName.trim().equalsIgnoreCase("Bosch")) {
			empList.add("Tom");
			empList.add("Ram");
			empList.add("Shashi");
			empList.add("Laksh");		
			empList.add("Vivek");
			empList.add("Anusha");	
			empList.add("Akash");
		}
		else
		{
			System.out.println("Company not found...Please enter valid company name");
		}
		return empList;
	}

	public static void main(String[] args) {
		Ass8_ArraylistMethodExample obj = new Ass8_ArraylistMethodExample();
		ArrayList<String> empList =obj.employeeList("Bosch");
		System.out.println(empList);
		System.out.println("Employee count -- " + empList.size());
		
		ArrayList<String> nalEmpList =obj.employeeList("NAL");
		System.out.println(nalEmpList);
		System.out.println("Employee count -- " + nalEmpList.size());
	}

}
