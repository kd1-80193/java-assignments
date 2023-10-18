
public class Q4a {

	public static void main(String[] args) 
	{
		int row=4;
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
