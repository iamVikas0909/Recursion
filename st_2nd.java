package recursion;

public class st_2nd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = {1,1,1,1,1,2,2,3,4,4,4};

		int b[]= {1,2,4};
		a=loopi(0,b,a);
		print(0,a);

	}

	private static void print(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			System.out.print(a[i]+" ");	
			print(++i,a);
		}
		
	}

	private static int[] loopi(int i, int[] b, int[] a) {
		// TODO Auto-generated method stub
		if(i<b.length)
		{
			int cnt=0;
			cnt=loopj(i,0,cnt,a,b);
			int [] c =new int[a.length-cnt];
			int count=0;
			int index=0;
			loopk(0,a,b,i,count,index,c);
			a=c;
			return loopi(++i,b,a);
		}
		return a;


	}

	private static void loopk(int k, int[] a, int[] b,int i,int count, int index,int c[])
	{
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			if(b[i] == a[k] && count<2)
			{
				count++;
			}
			else
			{
				c[index++]=a[k];
			}
			
			loopk(++k,a,b,i,count,index,c);
		}
		
	}

	private static int loopj(int i, int j, int cnt, int[] a, int[] b) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(b[i]==a[j] && cnt<2)
			{
				cnt++;
			}
			return loopj(i,++j,cnt,a,b);
		}
		return cnt;

	}
}


