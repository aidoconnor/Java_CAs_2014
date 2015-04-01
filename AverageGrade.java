import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageGrade {
	
	public static void main(String[] args)
	{
		// create Scanner object to read user input
		Scanner reader = new Scanner(System.in);
		
		// create Decimal Format object to round to 3 decimal places
		DecimalFormat formattedToThreePlaces = new DecimalFormat("#.000");
		
		// ask user for maths, science and geography grade
		System.out.print("Please enter your Maths mark:\t\t");
		double mathsMark = reader.nextDouble();
		
		System.out.print("Please enter your Science mark:\t\t");
		double scienceMark = reader.nextDouble();
		
		System.out.print("Please enter your Geography mark:\t");
		double geographyMark = reader.nextDouble();
		
		// calculate average grade 
		double averageGrade = (mathsMark + scienceMark + geographyMark) / 3;
		
		//format to three decimal places
		String formattedAverageGrade = formattedToThreePlaces.format(averageGrade);
		
		// calculate grade output based on average grade
		if (averageGrade >= 0 && averageGrade <= 40)
		{
			System.out.println("\nMaths mark:\t\t\t" + mathsMark + "\nScience mark:\t\t" + scienceMark + "\nGeography mark:\t\t" + geographyMark);
			System.out.println("Average mark:\t\t" + formattedAverageGrade);
			System.out.println("Grade:\t\t\t\tPass");
		}
		else if (averageGrade >40  && averageGrade <= 69)
		{
			System.out.println("\nMaths mark:\t\t\t" + mathsMark + "\nScience mark:\t\t" + scienceMark + "\nGeography mark:\t\t" + geographyMark);
			System.out.println("Average mark:\t\t" + formattedAverageGrade);
			System.out.println("Grade:\t\t\t\tMerit");
		}
		else
		{
			System.out.println("\nMaths mark:\t\t\t" + mathsMark + "\nScience mark:\t\t" + scienceMark + "\nGeography mark:\t\t" + geographyMark);
			System.out.println("Average mark:\t\t" + formattedAverageGrade);
			System.out.println("Grade:\t\t\t\tDistinction");
		}
	}
}
