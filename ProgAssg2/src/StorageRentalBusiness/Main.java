package StorageRentalBusiness;

import java.util.Scanner;
	
public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome To LUCKY Storage Rental Centre");

		//do {
			System.out.println("\nChoose your option:-");
			System.out.println("1-Admin");
			System.out.println("2-Customer");
			System.out.print("\nEnter option: ");
			int option = input.nextInt();
			
			if(option == 1) {
				System.out.println("\nWELCOME BACK ADMIN");
				
				System.out.print("Please enter employee's name: ");
				String employName = input.next();
				System.out.print("Please enter employee's age: ");
				int age = input.nextInt();
				System.out.print("Please enter employee's phone number: ");
				int employPhoneNum = input.nextInt();
				System.out.print("Please enter employee's position: ");
				String position = input.next()+input.nextLine();
				System.out.print("Please enter employee's gender (m/f): ");
				char gender = input.next().charAt(0);
				System.out.print("Please enter employee's salary: ");
				double salary = input.nextDouble();
				System.out.print("Please enter EPF rate: ");;
				double epf = input.nextDouble();	
				
				Employee employee = new Employee("LUCKY Storage Rental Centre",32500008,"www.luckystoragerental.com",employName,age,employPhoneNum,position,gender,salary,epf);
				employee.printInfo();
				Finance finance = new Finance("LUCKY Storage Rental Centre",32500008,"www.luckystoragerental.com",employName,age,employPhoneNum,position,gender,salary,epf,10000,3500,200,1400);
				finance.printInfo();
			}
			else {
				AdvertisementAndMarketing advert = new AdvertisementAndMarketing("LUCKY Storage Rental Centre",32500008,"www.luckystoragerental.com");
				advert.printInfo();
				
				System.out.println("\nWhich storage are you interested in ?");
				System.out.println("1. Normal Storage");
				System.out.println("2. Storage with Freezer");
				System.out.println("3. Double Storey Storage");
				System.out.print("Enter your option: ");
				int storageType = input.nextInt();
				
				StorageType storage = new StorageType("LUCKY Storage Rental Centre",32500008,"www.luckystoragerental.com",storageType);
				storage.printInfo();
				
				Sales sale = new Sales("LUCKY Storage Rental Centre",32500008,"www.luckystoragerental.com",storageType);
				sale.printInfo();
			}
			
			
		//}while
	}

}
