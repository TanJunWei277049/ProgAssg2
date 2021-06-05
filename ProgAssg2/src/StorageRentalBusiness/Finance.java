package StorageRentalBusiness;

public class Finance extends Employee{  //User Define Class

	private double income;
	private double employSalary;
	private double maintenanceFee;
	private double utility;
	private double advertFees;
	private double elaun;
	
	public Finance(String companyName,int phoneNum,String website,String employName,int age,int employPhoneNum,String position,char gender,double salary,double epf,double income,double maintenanceFee,double utility,double advertFees) {  //constructor with 5 arguments
		
		super(companyName,phoneNum,website,employName,age,employPhoneNum,position,gender,salary,epf);
		
		this.income = income;
		this.employSalary = super.salary;
		this.maintenanceFee = maintenanceFee;
		this.utility = utility;
		this.advertFees = advertFees;
		this.elaun = super.elaun;
	}
	
	public double totalExpenses() {
		return employSalary + maintenanceFee + utility + advertFees + elaun;
	}
	
	public double netProfit() {
		return income - totalExpenses();
	}
	
	public void printInfo() {
		System.out.println("\n-------Financial report-------");
		System.out.println("Total Income\t:RM"+income);
		System.out.println("Total Expenses\t:RM"+totalExpenses());
		System.out.println("Total Profit\t:RM"+netProfit());
	}
	
}
