package assignments;

public class Ass6_Employee {

	int empID;
	String empName;
	String empDesignation;
	String empLocation;
	boolean isPermanentEmp;
	char empGender;
	double empSalary;
	float empHeight;
	static final String companyName = "NAL";
	static final String CEOOfCompany = "Naveen";
	
	
	
	
	public static void main(String[] args) {
		//WAP employee class 10 var, print default values, 3 objects 2 static 
		
		Ass6_Employee employee = new Ass6_Employee();
		
		System.out.println( employee.empID +","+ employee.empName + ","+ employee.empDesignation + "," +
		employee.empLocation + "," + employee.isPermanentEmp +"," + employee.empGender + "," + 
				employee.empSalary +","+ employee.empHeight + "," + companyName + ","+ CEOOfCompany);
		
		employee.empID = 1001;
		employee.empName = "Ram";
		employee.empDesignation = "Manager";
		employee.empLocation = "Bengalore";
		employee.isPermanentEmp = true;
		employee.empGender = 'M';
		employee.empSalary = 17.50d;
		employee.empHeight = 5.2f;
		
		System.out.println( employee.empID + "," + employee.empName + ","+ employee.empDesignation + "," +
				employee.empLocation + ","+ employee.isPermanentEmp + "," + employee.empGender + ","+ 
						employee.empSalary + ","+ employee.empHeight + ","+ companyName + "," + CEOOfCompany);
		
		Ass6_Employee employee1 = new Ass6_Employee();
		
		employee1.empID = 1002;
		employee1.empName = "Nivetha";
		employee1.empDesignation = "Associate";
		employee1.empLocation = "Pune";
		employee1.isPermanentEmp = false;
		employee1.empGender = 'F';
		employee1.empSalary = 10.50d;
		employee1.empHeight = 5.4f;
		
		System.out.println( employee1.empID + "," + employee1.empName + "," + employee1.empDesignation + "," +
		employee1.empLocation + "," + employee1.isPermanentEmp + "," + employee1.empGender + "," + 
				employee1.empSalary + "," + employee1.empHeight + "," + companyName + "," + CEOOfCompany);
		
		
		Ass6_Employee employee2 = new Ass6_Employee();
	
		employee2.empID = 1003;
		employee2.empName = "Vinod";
		employee2.empDesignation = "Lead";
		employee2.empLocation = "Mumbai";
		employee2.isPermanentEmp = true;
		employee2.empGender = 'M';
		employee2.empSalary = 12.50d;
		employee2.empHeight = 5.0f;
		
		
		System.out.println( employee2.empID + "," + employee2.empName + "," + employee2.empDesignation +"," +
		employee2.empLocation + "," + employee2.isPermanentEmp + "," + employee2.empGender + "," + 
				employee2.empSalary + "," + employee2.empHeight +"," + companyName +"," + CEOOfCompany);
	}

}
