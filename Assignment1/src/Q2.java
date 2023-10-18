import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		double num1;
		double num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the first double value: ");
		if(sc.hasNextDouble()!= sc.hasNextInt()) 
		{
			num1=sc.nextDouble();
			
			System.out.println("Enter the second double value");
			if(sc.hasNextDouble()!= sc.hasNextInt()) 
			{
				num2=sc.nextDouble();
				
				double avg=(num1+num2)/2;
				System.out.println("Average "+ avg);
			}
			else
			{
				System.out.println("Error : Second value is not double");
			}
			
		}
		else
		{
			System.out.println("Error : First value is not double");
		}

	}

}
