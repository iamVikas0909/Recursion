package recursion;


public class left_shift 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			3,2,4,6,5,6,8
		}
		;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(int[] a) 
	{
		//WriteCode Here
		int temp=a[0];
		loopI(a,0);
		a[a.length-1]=temp;
		print(a,0);
	}
	public static void loopI(int [] a,int i)
	{
		if(i<a.length-1)
		{
			a[i]=a[i+1];
			loopI(a,++i);
		}
	}
	public static void print(int []a,int i)
	{
		if(i<a.length)
		{
			System.out.print(a[i]+" ");
			print(a,++i);
		}
	}
}
