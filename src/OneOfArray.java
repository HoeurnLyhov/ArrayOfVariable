import java.util.Scanner;
public class OneOfArray {
	
	public static void main(String[] arg)
	{
		int a[]=new int[5];
		
		System.out.println(" Enter value foe the elements : ");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("The array elements are: ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
	}
}
