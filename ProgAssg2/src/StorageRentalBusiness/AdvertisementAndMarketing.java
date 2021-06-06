package StorageRentalBusiness;

public class AdvertisementAndMarketing extends StorageRentalCentre{  //2.1 Inheritance
	
	public AdvertisementAndMarketing(String companyName, int phoneNum, String website) {
		
		super(companyName,phoneNum,website);
	}
	
	public void printInfo() {  // 2.2 Polymorphism
		System.out.println("Promotion!!!\nPromotion!!!\nGet to rent a storage with the lowest price now!!!");
		System.out.println("Dont miss the chance!!!");
		System.out.println("Contact us now via " +website +" or "+phoneNum +" !!!");
	}

}
