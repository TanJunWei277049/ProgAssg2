package StorageRentalBusiness;

import java.util.Scanner;

public class Customer extends StorageType{  //User Define Class
	
	private String custName;
	private int age;
	private int custPhoneNum;
	private char gender;
	protected int day;
	
	Scanner in = new Scanner(System.in);  //Pre-Define Class
	
	public Customer(String companyName, int phoneNum, String website,int storageType) {  //constructor with no argument
		
		super(companyName,phoneNum,website,storageType);
		
		System.out.println("\nRegistration For "+super.storageName);
		System.out.print("Please enter customer's name :");
		this.custName = in.next();
		System.out.print("Please enter customer's age :");
		this.age = in.nextInt();
		System.out.print("Please enter customer's phone number :");
		this.custPhoneNum = in.nextInt();
		System.out.print("Please enter customer's gender (m/f):");
		this.gender = in.next().charAt(0);
		System.out.print("Please enter how many days to rent :");
		this.day = in.nextInt();
		
		printInfo();
	}
	
	public void printInfo() {
		System.out.println("\n-------Customer's Details-------");
		System.out.println("Customer's name :"+this.custName);
		System.out.println("Customer's age :"+this.age);
		System.out.println("Customer's phone number :"+this.custPhoneNum);
		System.out.println("Customer's gender :"+this.gender);
	}

}
