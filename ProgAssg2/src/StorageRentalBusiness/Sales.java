package StorageRentalBusiness;

public class Sales extends Customer{  //User Define Class
	
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
				sales = totalPrice();
				discount = 0;
			}
			else if(day>30 && day<=70) {
				double newPrice = 85;
				price = newPrice;
				discount = 0;
				sales = totalPrice(newPrice);
			}
			else {
				double newPrice = 82;
				price = newPrice;
				discount = 0.1;
				sales = totalPrice(newPrice,discount);
			}
		}
		else if(storageType == 2) {
			storageName = "Storage with Freezer";
			price = 200;
			
			if(day<=30) {
				sales = totalPrice();
				discount = 0;
				
			}
			else if(day>30 && day<=70) {
				double newPrice = 190;
				price = newPrice;
				discount = 0;
				sales = totalPrice(newPrice);
			}
			else {
				double newPrice = 180;
				price = newPrice;
				discount = 0.1;
				sales = totalPrice(newPrice,discount);
			}
		}
		else {
			storageName = "Double Storey Storage";
			price = 130;
			
			if(day<=30) {
				sales = totalPrice();
				discount = 0;
				
			}
			else if(day>30 && day<=70) {
				double newPrice = 120;
				price = newPrice;
				discount = 0;
				sales = totalPrice(newPrice);
			}
			else {
				double newPrice = 110;
				price = newPrice;
				discount = 0.1;
				sales = totalPrice(newPrice,discount);	
			}
		}
		
		
	}
	
	public double totalPrice() {
		return this.price*day;
	}
	
	public double totalPrice(double newPrice) {
		return newPrice*day;
	}
	
	public double totalPrice(double newPrice, double discount) {
		return (newPrice*day)*(1-discount);
	}
	
	public void printInfo() {
		System.out.println("\n-------Storage Rent-------");
		System.out.println("Storage Type\t\t:"+storageName);
		System.out.println("Day rent\t\t:"+day+" days");
		System.out.println("Price per day\t:RM"+price);
		System.out.println("Discount\t\t:"+(discount*100)+"%");
		System.out.println("Total price\t\t:RM"+sales);
		System.out.println("\nThank you. Please Come Again.");
	}

}
