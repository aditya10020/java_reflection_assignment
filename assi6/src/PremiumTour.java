package MetTour;
public class PremiumTour
{	
	private double amount=1200;

	public double getDaysRentForCommon(int days,int noPersons)
	{
	    double m = days > 6 ?amount-100:amount;
            m = noPersons>=4?amount-100:amount;    
            return m*days*noPersons;
	}
	public double getDaysRentForSeniors(int days,int noPersons)
	{
	   	return getDaysRentForCommon(days,noPersons)-(days*100);
	}
	public double getDaysRentForWomen(int days,int noPersons)
	{	
	   	return getDaysRentForCommon(days,noPersons)-(days*200);	  
	}

}
