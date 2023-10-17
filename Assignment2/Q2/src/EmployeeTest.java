import java.util.Scanner;

/*Q2. Create a class called Employee that includes three fields—a first name (type String), a last
name (type String) and a monthly salary (double). Provide a constructor that initializes the three
instance variables. Provide a set and a get method for each instance variable. If the monthly salary
is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.*/

class Employee
{
	String fname;
	String lname;
	double salary;
	public Employee() {
		this.fname ="";
		this.lname ="";
		this.salary = 0;
	}
	public Employee(String fname, String lname, double salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void acceptEmployee()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Name = ");
		fname=sc.next();
		System.out.print("Enter Last Name = ");
		lname=sc.next();
		System.out.print("Enter Salary = ");
		salary=sc.nextDouble();
		if(salary<0)
		{
			System.out.println(salary=0);
			System.out.println("Enter Valid Salary ");
		}

	}
	public void displayYearlySalary()
	{
		System.out.println("Annual Salary = "+salary*12);
	}
	public void displayRaise()
	{
		System.out.println("Employees salary raise = "+salary+salary*0.10);
	}
	public void displayEmployee()
	{
		System.out.println("First Name = "+fname);
		System.out.println("Last Name = "+lname);
		System.out.println("salary = "+salary);
		
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.acceptEmployee();
		employee.displayEmployee();
		employee.displayYearlySalary();
		employee.displayRaise();
		
		Employee employee2=new Employee();
		employee2.acceptEmployee();
		employee2.displayEmployee();
		employee2.displayYearlySalary();
		employee2.displayRaise();
		
		
	
	}

}
