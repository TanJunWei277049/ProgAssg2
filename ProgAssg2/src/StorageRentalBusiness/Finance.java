package StorageRentalBusiness;

public class Finance extends Employee{  //2.1 Inheritance

	private double income;
	private double employSalary;
	private double maintenanceFee;
	private double elaun;
	private double totalExpense;
	private String month;
	
	public Finance(String companyName,int phoneNum,String website,String employName,int age,int employPhoneNum,String position,char gender,double salary,double epf,double income,double maintenanceF) {  
		
		super(companyName,phoneNum,website,employName,age,employPhoneNum,position,gender,salary,epf);
		
		this.income = income;
		this.employSalary = super.salary;
		this.maintenanceFee = maintenanceF;
		this.elaun = super.elaun;
		
		Payment f = new FinanceGetPayment();  // 2.5 interface
		totalExpense = f.getPayment(employSalary, maintenanceFee, elaun);
		
	}
	
	public void setMonth(String month) {  // 2.3 Encapsulation
		this.month = month;
	}
	
	public String getMonth() {  // 2.3 Encapsulation
		return this.month;
	}
	
	
	public double netProfit() {
		return income - totalExpense;
	}
	
	public void printInfo() {  // 2.2 Polymorphism
		System.out.println("Total Income\t:RM"+income);
		System.out.println("Total Expenses\t:RM"+totalExpense);
		System.out.println("Total Profit\t:RM"+netProfit());
	}
	
}
