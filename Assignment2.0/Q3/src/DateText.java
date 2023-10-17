import java.util.Scanner;

/*Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
year (type int). Provide a constructor that initializes the three instance variables and assumes that
the values provided are correct. Provide a set and a get method for each instance
variable. Provide a method displayDate that displays the month, day and year separated by forward
slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.*/
class Date
{
	int day;
	int month;
	int year;
	
	public Date() {
		this.day = 1;
		this.month = 1;
		this.year = 1900;
	}
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void acceptDate()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter day = ");
		day=sc.nextInt();
		System.out.print("Enter month = ");
		month=sc.nextInt();
		System.out.print("Enter Year = ");
		year=sc.nextInt();
	}
	public void displayDate()
	{
		System.out.print(year+"/"+month+"/"+day);	
	}
}
public class DateText {

	public static void main(String[] args) {
			Date date=new Date();
			date.acceptDate();
			date.displayDate();

	}

}
