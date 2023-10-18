
public class Q4c {

	public static void main(String[] args) 
	{
		int row=5;
		for(int i=0;i<=row;i++)
		{
			for(int j=row;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int z=0;z<=i;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
