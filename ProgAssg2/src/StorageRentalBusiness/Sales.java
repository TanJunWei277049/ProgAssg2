package StorageRentalBusiness;

public class Sales extends Customer{  //2.1 Inheritance
	
	private String storageName;
	private double price;
	private double day;
	private double sales;
	private double discount;
	
	public Sales(String companyName, int phoneNum, String website,int storageType) {  //constructor with 2 arguments
		
		super(companyName,phoneNum,website,storageType);
		
		this.day = super.day;
		
		if(storageType == 1) {
			storageName = "Normal Storage";
			price = 90;
			
			if(day<=30) {
				discount = 0;
				Payment s = new SalesGetPayment(); // 2.5 interface
				sales = s.getPayment(price, day, discount);
			}
			else if(day>30 && day<=70) {
				double newPrice = 85;
				price = newPrice;
				discount = 0;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
			}
			else {
				double newPrice = 82;
				price = newPrice;
				discount = 0.1;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
			}
		}
		else if(storageType == 2) {
			storageName = "Storage with Freezer";
			price = 200;
			
			if(day<=30) {
				discount = 0;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
				
			}
			else if(day>30 && day<=70) {
				double newPrice = 190;
				price = newPrice;
				discount = 0;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
			}
			else {
				double newPrice = 180;
				price = newPrice;
				discount = 0.1;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
			}
		}
		else {
			storageName = "Double Storey Storage";
			price = 130;
			
			if(day<=30) {
				discount = 0;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
				
			}
			else if(day>30 && day<=70) {
				double newPrice = 120;
				price = newPrice;
				discount = 0;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
			}
			else {
				double newPrice = 110;
				price = newPrice;
				discount = 0.1;
				Payment s = new SalesGetPayment();
				sales = s.getPayment(price, day, discount);
			}
		}
		printInfo(custName);
		
		
	}
	
	
	public void printInfo(String name) {  // 2.2 Polymorphism
		System.out.println("\n-------Storage Rent-------");
		System.out.println("Storage Type\t:"+storageName);
		System.out.println("Day rent\t:"+day+" days");
		System.out.println("Price per day\t:RM"+price);
		System.out.println("Discount\t:"+(discount*100)+"%");
		System.out.println("Total price\t:RM"+sales);
		System.out.println("\nThank you Mr/Mrs " + name + ". Please Come Again.");
	}

}
