import java.util.Scanner;

/*Q1. Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store. An Invoice should include four pieces of information as fields—a part number
(type String), a part description (type String), a quantity of the item being purchased (type int) and a
price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
calculates the invoice amount (i.e. multiplies the quantity by the price per item), then returns the
amount as a double value.
If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.0.
Write a test application named InvoiceTest that demonstrate class Invoice’s capabilities.*/

class Invoice 
{
	String partNumber;
	String partDescription;
	int quantity;
	double price;
	public Invoice() {
		this.partNumber = "";
		this.partDescription = "";
		this.quantity =0;
		this.price =0;
	}
	public Invoice(String partNumber, String partDescription, int quantity, double price) {
		super();
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void acceptInvoice()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter part Number = ");
		partNumber=sc.next();
		System.out.print("Enter part Description = ");
		partDescription=sc.next();
		System.out.print("Enter Quantity = ");
		quantity=sc.nextInt();
		if(quantity<0)
		{
			System.out.println("Quantity = "+(quantity=0));
			System.out.println("Enter valid Quantity!!!");
		}
		System.out.print("Enter Price = ");
		price=sc.nextDouble();
		if(price<0)
		{
			System.out.println("Price = "+(price=0));
			System.out.println("Enter valid Price!!!");
		}
	}
	public double calculateInvoiceAmount()
	{
		return price*quantity;
	}
	public void displayInvoice()
	{
		
		System.out.println("Part Number = "+partNumber);
		System.out.println("Part Description = "+partDescription);
		System.out.println("Quantity = "+quantity);
		System.out.println("Price = "+price);
		System.out.println("Total Invoice Amount = "+calculateInvoiceAmount());
	}
	
}
public class InvoiceTest {
public static void main(String[] args) {
	Invoice invoice=new Invoice();
	invoice.acceptInvoice();
	invoice.calculateInvoiceAmount();
	invoice.displayInvoice();
}
}
