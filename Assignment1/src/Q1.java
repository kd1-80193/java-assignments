import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		int value;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		value = sc.nextInt();
		
		System.out.println("Given number"+ value);
		System.out.println("Binary equivalent = "+Integer.toBinaryString(value));
		System.out.println("Octal equivalent = "+Integer.toOctalString(value));
		System.out.println("Hexadecimal equivalent = "+Integer.toHexString(value));
		
	}

}
