/*In above assignment, create one more array of Double (constant values) where few elements are repeated. Input a key from user and check how many
times key is repeated in the array using appropriate lambda expression.*/

import java.util.Scanner;
public class Demo5 {
	public static int countIf(Double []arr,Double key,Check co)
	{
		int cnt =0;
		
		for(Double ele :arr)
		{ 
			if(co.compare(ele, key))
				cnt++;
		}
		return cnt;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double[] arr= {1.1,1.2,1.3,1.4,1.3,1.5,1.6,1.2};
		
		Double key;
		System.out.println("Enter Key:");
		key=sc.nextDouble();
		
		int cnt =countIf(arr,key,(e,k)-> e.equals(k));
		System.out.println("Count:"+cnt);
	}

}
