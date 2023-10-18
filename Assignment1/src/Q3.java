import java.util.Scanner;

public class Q3 
{

	public static void main(String[] args) 
	{
		int choice;
		double amount=0;
		do
		{
			int quantity;
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("0. EXIT");
			System.out.println("1.Dosa = 100 Rs");
			System.out.println("2.Samosa = 20 Rs");
			System.out.println("3.Idli = 70 Rs");
			System.out.println("4.Chole Bature = 95 Rs");
			System.out.println("5.Vadapav = 30 Rs");
			System.out.println("6.Misal = 85 Rs");
			System.out.println("7.Pohe = 35 Rs");
			System.out.println("8.Dhokla = 120 Rs");
			System.out.println("9.Burger = 150 Rs");
			System.out.println("10.Generate Bill");
			System.out.print("Enter your choice");
			choice=sc.nextInt();
					
			switch(choice) 
			{
			
			case 1:
				System.out.println("Please Enter Dosa Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 100);
				break;
			case 2:
				System.out.println("Please Enter Samosa Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 20);
				break;
			case 3:
				System.out.println("Please Enter Idli Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 70);
				break;
			case 4:
				System.out.println("Please Enter Chole Bature Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 95);
				break;
			case 5:
				System.out.println("Please Enter Vadapav Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 30);
				break;
			case 6:
				System.out.println("Please Enter Misal Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 85);
				break;
			case 7:
				System.out.println("Please Enter Pohe Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 35);
				break;
			case 8:
				System.out.println("Please Enter Dhokla Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 120);
				break;
			case 9:
				System.out.println("Please Enter Burger Quantity");
				quantity=sc.nextInt();
				amount = amount + (quantity * 150);
				break;
			case 10:
				System.out.println("Enter your bill"+amount);
				break;
			default:
				System.out.println("Wrong choice...");
				break;
			
			}
			System.out.println("THANKS U FOR VISTITING OUR STORE ");
		}while(choice!=0);
	}

}
