package StorageRentalBusiness;

public abstract class StorageRentalCentre {  //define superclass as abstract class
	
	protected String companyName;
	protected int phoneNum;
	protected String website;
	
	public StorageRentalCentre(String companyName, int phoneNum, String website) {  //constructor with 4 arguments
		this.companyName = companyName;
		this.phoneNum = phoneNum;
		this.website = website;
	}
	
	public abstract void printInfo();

}
