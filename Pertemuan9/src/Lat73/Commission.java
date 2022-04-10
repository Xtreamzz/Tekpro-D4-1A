package Lat73;

public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;
	
	public Commission(String eName, String eAddress, String ePhone, 
			String socSecNumber,double rate, double commissionRate){
		super(eName, eAddress, ePhone, socSecNumber, rate);
		this.commissionRate = commissionRate;
		}
	public void addSales(double totalSales){
	       this.totalSales += totalSales;
	   }
	   public double pay()
	   {
	      double commission = totalSales * commissionRate/100;
	      double payment = super.pay() + commission;

	      totalSales = 0;
	      return payment;
	   }
	   public String toString(){
	      String result = super.toString();

	      result += "\nTotal Sales: " + totalSales;

	      return result;
	   }

	    public double getTotalSales() {
	        return totalSales;
	    }

	    public void setTotalSales(double totalSales) {
	        this.totalSales = totalSales;
	    }

	    public double getComRate() {
	        return commissionRate;
	    }

	    public void setComRate(double comRate) {
	        this.commissionRate = comRate;
	    }
}
