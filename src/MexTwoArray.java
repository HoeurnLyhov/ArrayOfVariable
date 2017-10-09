import java.util.Scanner;
public class MexTwoArray {

	public static void main(String[] args) {
		int a[]=new int [20],asize;
		int b[]=new int [20],bsize;
		int c[]=new int [20];
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array a: ");
		asize=s.nextInt();
		System.out.println("Enter the element of array a: ");
		for(int i=0;i<asize;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter size of array b: ");
		bsize=s.nextInt();
		System.out.println("Enter the element of array b: ");
		for(int j=0;j<bsize;j++)
		{
			b[j]=s.nextInt();
		}
		
		for(int i=0,j=0,k=0;i<asize+bsize;)
		{
			c[i++]=a[j++];
			c[((asize+bsize)-i)]=b[k++];
		}
		
		
		System.out.println("mex array a and b is: ");
		for(int i=0;i<asize+bsize;i++)
		{
			System.out.print(" "+c[i]);
		}
	}

}
