import java.util.Scanner;

public class ReadInNumber {

    public static void main(String args[])
    {
    	Scanner reader = new Scanner(System.in);
    	int number = 0;
    	
    	while(number != 10000)
    	{
    		System.out.print("Please enter a number: ");
    		number  = reader.nextInt();
    			
    			if(number < 100)
    			{
    				System.out.print("Please enter a number greater than 100");
    				number  = reader.nextInt();
    			}
    			
    			if(number == 10000)
    			{
    				System.exit(0);
    			}
    	}	
    }
    
    
}