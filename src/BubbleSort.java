import java.util.Scanner;
public class BubbleSort 
{
	public static void Bsort(int a[],int s)
	{
		int tmp=0;
		for(int i=0;i<s;i++)//loop of Execusion
		{
			for(int j=1;j<=s-i-1;j++)
			{
				if(a[j]<a[j-1])
				{
					tmp=a[j];
					a[j]=a[j-1];
					a[j-1]=tmp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[]=new int [20],size;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		size=s.nextInt();
		System.out.println("Enter the array element: ");
		
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		Bsort(a,size);
		 
		System.out.println("After Sorting the array: ");
		for(int i=0;i<size;i++)
		{
			System.out.print(" "+a[i]);
		}

	}

}
