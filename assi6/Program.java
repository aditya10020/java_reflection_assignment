import MetTour.*;
import java.lang.reflect.*;

class Program 
{


	public static void main(String []args)throws Exception
	{
		int days = Integer.parseInt(args[0]);
		int noPerson = Integer.parseInt(args[1]);
		Class<?> c = Class.forName(args[2]);
	        Method rent = c.getMethod(args[3], int.class, int.class);

		Object scheme = c.getConstructor().newInstance();
		double r = (double)rent.invoke(scheme, days, noPerson);

		System.out.printf("the total package expenses = %s%n",r);	
	}

}
