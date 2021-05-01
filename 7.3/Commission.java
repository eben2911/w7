package week7b;


public class Commission extends Hourly{
	private double total_sales;
	private double commission_rate;
	
	public Commission(String name, String address, String phone, String sec_number, double rate, double comm_rate){
		super(name, address, phone, sec_number, rate);
		commission_rate = comm_rate;
	}
	
	public void addSales(double total_sales){
		this.total_sales = total_sales;
	}
	
	public double pay(){
		double payment = super.pay() + (total_sales * commission_rate);
		
		total_sales = 0;
		
		return payment;
	}
	
	public String toString(){
		String result = super.toString();
		
		result += "\n Total sales: " + total_sales;
		
		return result;
	}
}