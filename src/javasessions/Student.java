package javasessions;

public class Student {

	String name;
	int age;
	String city;
	
	public static void main(String[] args) {
		Student u1 = new Student();
		u1.name = "Amit";
		u1.age = 10;
		u1.city = "UK";
		
		Student u2 = new Student();
		u2.name = "Bharat";
		u2.age = 20;
		u2.city = "LA";
		
		Student u3 = new Student();
		u3.name = "Catty";
		u3.age = 30;
		u3.city = "SA";
		
		Student u4 = new Student();
		u4.name = "Danny";
		u4.age = 40;
		u4.city = "US";
		
		System.out.println("All objects output");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("--------------------------------------");
		
		u1=u2;
		System.out.println("when u1 = u2");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("--------------------------------------");
		
		u2=u3;
		System.out.println("when u2 = u3");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("--------------------------------------");
		
		u3=u4;
		System.out.println("when u3 = u4");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
		
		System.out.println("--------------------------------------");
		
		u4=u1;
		System.out.println("when u4 = u1");
		System.out.println(u1.name + " " + u1.age + " " + u1.city);
		System.out.println(u2.name + " " + u2.age + " " + u2.city);
		System.out.println(u3.name + " " + u3.age + " " + u3.city);
		System.out.println(u4.name + " " + u4.age + " " + u4.city);
	}

}
