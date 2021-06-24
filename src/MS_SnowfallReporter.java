/**
* Program Name:		MS_SnowfallReporter.java
* @author:		    Meenu Shabi 0908938
* Date:   		 	Oct 24, 2019
* Purpose:          The SnowfallReporter predict snowfall data and produces statistics using actual snowfall data.
*/
import java.util.Scanner;

public class MS_SnowfallReporter
{

	public static void main(String[] args)
	
	{
		Scanner input=new Scanner(System.in);
		//Declearing variables
		int random=0;
		int i=0;
		int y=0;
		final int HIGH=150;
		final int LOW=0;
		String[] monthsArray= {"September","October","November","Decemer","January","February"};
		int[] predictedSnowfallArray= new int[6];
		double[] actualSnowfallArray= new double[6];
		int actualSnowFall=0;
		
		
		
		
		//Title
		System.out.println("***Meenu's Snowfall Reporter***");
		System.out.println("__________________________________________________________________________________________");
		System.out.println("Description");
		System.out.println("This program compares predicted snowfall data against actual snowfall data,");
		System.out.println("over a 6-month period,finding the smallest difference between them.");
		System.out.println("Then, the program produces statistics using the actual snowfall data." );
		System.out.println("__________________________________________________________________________________________");
		
		//Predicted Snowfall
		for(i=0;i<6;i++)
		{
			random=(int) (Math.random())* (HIGH-LOW+1)+LOW;
			predictedSnowfallArray[i]=random;
		}
		
		System.out.println("Predicted Snowfall for a 6-month Period:");
		while(x<6)
		{
			System.out.println(monthsArray[x]+":			"  +     predictedSnowfallArray[x]+" centimeters");
			
			x++;
		}
		System.out.println("__________________________________________________________________________________________");
		//Input from user
		
			System.out.println("Enter actual snowfall for each month, in centimeters between 0-150.");
			while(y<6)
			{
				
				actualSnowFall=input.nextInt();
				if(actualSnowFall<0 && actualSnowFall>150)
				{
					System.out.println("Invalid input! Enter snowfall between 0-150 centimeters:");
					actualSnowFall=input.nextInt();
					
				}
				actualSnowfallArray[y]=actualSnowFall;
				System.out.println(monthsArray[y]+":			"+actualSnowfallArray[y]+" centimeters");
				y++;
				
			}
			System.out.println("__________________________________________________________________________________________");
			System.out.println("***Snowfall Report***");
			System.out.println("__________________________________________________________________________________________");
			
			
	input.close();
		
	}
	//End of main method

}
//End of class

