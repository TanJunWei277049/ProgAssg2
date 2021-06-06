package StorageRentalBusiness;

class SalesGetPayment implements Payment{
	
	public double getPayment(double price,double day,double discount) {
		return (price*day)*(1-discount);
	}
}

class FinanceGetPayment implements Payment{
	
	public double getPayment(double expense1,double expense2,double expense3) {
		return expense1+expense2+expense3;
	}
	
}
