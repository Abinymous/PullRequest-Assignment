package Bhatnagar_Abi;
import java.util.Calendar;

public class Driver
{
	public static void main(String[] args)
	{
		Calendar.getInstance();
		
		System.out.println(Exercises.threeAndFive());
		System.out.println(Exercises.evenFibSum());
		
        long timePrior = Calendar.getInstance().getTimeInMillis();
        System.out.println(Exercises.largestPrimeFactor());
        long timeAfter = Calendar.getInstance().getTimeInMillis();
        System.out.println("(" + (timeAfter - timePrior) + ")");
	}
}
