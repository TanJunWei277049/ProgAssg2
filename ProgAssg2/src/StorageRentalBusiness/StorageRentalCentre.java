package StorageRentalBusiness;

public abstract class StorageRentalCentre {  // 2.4 Abstraction
	
	protected String companyName;
	protected int phoneNum;
	protected String website;
	
	public StorageRentalCentre(String companyName, int phoneNum, String website) {  
		this.companyName = companyName;
		this.phoneNum = phoneNum;
		this.website = website;
	}
	
	public abstract void printInfo();

}
