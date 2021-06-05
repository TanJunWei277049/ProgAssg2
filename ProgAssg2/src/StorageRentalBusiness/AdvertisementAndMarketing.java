package StorageRentalBusiness;

public class AdvertisementAndMarketing extends StorageRentalCentre{  //User Define Class
	
	public AdvertisementAndMarketing(String companyName, int phoneNum, String website) {
		
		super(companyName,phoneNum,website);
	}
	
	public void printInfo() {
		System.out.println("Promotion!!!\nPromotion!!!\nGet to rent a storage with the lowest price now!!!");
		System.out.println("Dont miss the chance!!!");
		System.out.println("Contact us now via " +website +" or "+phoneNum +" !!!");
	}

}
