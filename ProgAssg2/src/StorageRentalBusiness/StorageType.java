package StorageRentalBusiness;

public class StorageType extends StorageRentalCentre{  //User Define Class
	
	private int storageType;
	public String storageName;
	private String location;
	private int pricePerDay;
	
	public StorageType(String companyName, int phoneNum, String website,int storageType) {  //constructor with 1 argument

		super(companyName,phoneNum,website);
		this.storageType = storageType;
		
		if(this.storageType == 1) {
			storageName = "Normal storage";
			location = "Kuala Selangor, Sungai Besar, Bidor";
			pricePerDay = 90;
		}
		else if(this.storageType == 2) {
			storageName = "Storage with freezer";
			location = "Setia Alam, Kampar, Jeram";
			pricePerDay = 200;
		}	
		else {
			storageName = "Double storey storage";
			location = "Batu Pahat, Kulai, Kuala Langat";
			pricePerDay = 130;
		}
			
	}
	
	public void printInfo() {
		System.out.println("\n-------Storage Description For "+companyName+"-------");
		System.out.println("Storage Type\t\t:"+storageName);
		System.out.println("Price per day\t\t:RM"+pricePerDay);
		System.out.println("Location available\t:"+location);
	}
	
	
}
