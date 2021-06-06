package StorageRentalBusiness;

import java.util.Scanner;

public class Employee extends StorageRentalCentre{  //2.1 Inheritance

	private String employName;
	private int age;
	private int employPhoneNum;
	private String position;
	private char gender;
	protected double salary;
	private double epf;
	protected double elaun;
	private double totalPaid;
	
	Scanner in = new Scanner(System.in);  
	
	public Employee(String companyName,int phoneNum,String website,String employName,int age,int employPhoneNum,String position,char gender,double salary,double epf) {  
		
		super(companyName,phoneNum,website);
		
		this.employName = employName;
		this.age = age;
		this.employPhoneNum = employPhoneNum;
		this.position = position;
		this.gender = gender;
		this.salary = salary;
		this.epf = epf;	
		
		if(position.equals("salesman")) {
			elaun = 0;
			totalPaid = totalPaid();
		}
		else {
			elaun = 500;	
			totalPaid = totalPaid(elaun);
		}
	}
	
	public double totalPaid() {
		return salary*(1-epf);
	}
	
	public double totalPaid(double elaun) {
		return (salary+elaun)*(1-epf);
	}
	
	public void printInfo() {  // 2.2 Polymorphism
		System.out.println("\n----------Displaying Employee's Info For "+companyName+"----------");
		System.out.println("Employee's name\t\t:"+this.employName);
		System.out.println("Employee's age\t\t:"+this.age);
		System.out.println("Employee's phone number\t:"+this.employPhoneNum);
		System.out.println("Employee's position\t:"+this.position);
		System.out.println("Employee's gender\t:"+this.gender);
		System.out.println("Employee's salary\t:RM"+this.salary);
		System.out.println("Elaun get\t\t:RM"+elaun);
		System.out.println("Epf\t\t\t:"+epf*100+"%");
		System.out.println("Employee's salary paid\t:RM"+totalPaid);
	}
	
}
