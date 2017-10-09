import java.util.Scanner;
public class TwoArray {

	public static void main(String[] args) 
	{
		int a[][]= new int[][]
		{
				{3,3,3},
				{3,3,3},
				{3,3,3}
		};
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int d[][]=new int[3][3];
		int m[][]=new int[3][3];
		
		
		int z,t=0;
		
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of array A: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter value of array B: ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		//Calculetion
		//SUM
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		//Minus
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				d[i][j]=a[i][j]-b[i][j];
			}
		}
		//Mutiplaiy
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					z=a[i][j]*b[j][k];
					t=t+z;
				}
				m[i][j]=t;
				t=0;
			}
		}
		
		//Answer Output 
		
		//SUM
		System.out.println("Sum of a & b is : ");
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+c[i][j]);
			}
		}
		
		//Minus
		System.out.println("");
		System.out.println("Minus of a & b is : ");
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+d[i][j]);
			}
		}
		
		//Multiplaiy
		System.out.println("");
		System.out.println("Mutiplaiy of a & b is : ");
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			for(int j=0;j<3;j++)
			{
				System.out.print(" "+m[i][j]);
			}
		}
		
	}

}
