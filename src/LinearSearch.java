import java.util.Scanner;
public class LinearSearch 
{
	public static int LSearch(int a[] , int ele , int s)
	{
		int pos=-1;
		for(int i=0;i<s;i++)
		{
			if(a[i]==ele)
			{
				pos=i;
				return pos;
			}
		}
		return pos;
	}

	public static void main(String[] args) 
	{
		int a[]=new int [35],size,ele,pos;
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		size=b.nextInt();
		
		System.out.println("Enter the array element: ");
		for(int i=0;i<size;i++)
		{
			a[i]=b.nextInt();
		}
		
		System.out.println("Enter the element found size array: ");
		ele=b.nextInt();
		pos=LSearch(a,ele,size);
		
		if(pos==-1)
		{
			System.out.println("The element is Not found");
		}
		else
		{
			System.out.println("The element is found:  "+pos);
		}
	}

}
