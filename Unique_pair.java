package recursion;

public class Unique_pair {


	public static void main(String[] args) {

		int a[]= {1,2,3,3};
		int uniquecnt=0;
		uniquecnt = loopi(0,a,uniquecnt);
		int[] uniquearray=new int[uniquecnt];
		int index=0;
		loopk(0,a,uniquearray,index);
		
		print(0,uniquearray);
	}
	private static void print(int i, int[] uniquearray) 
	{
		if(i<uniquearray.length)
		{
		int j=i+1;
		loopn(j,uniquearray,i);
		print(++i,uniquearray);
		}
	}
	private static void loopn(int j, int[] uniquearray, int i) {
	if(j<uniquearray.length)
	{	
		System.out.println(uniquearray[i]+" "+uniquearray[j]);
		loopn(++j,uniquearray,i);
	}
}
	private static void loopk(int k, int[] a,int []uniquearray,int index) {
	if(k<a.length)
	{
		int cnt=0;
		cnt=loopl(0,k,a,cnt);
		if(cnt==0)
		{
			uniquearray[index++]=a[k];
		}
		loopk(++k,a,uniquearray,index);
	}	
}
	private static int loopl(int l, int k, int[] a,int cnt) {
		if(l<k)
		{
			if(a[k]==a[l])
				cnt++;
			
			
			return loopl(++l,k,a,cnt);
		}
		return cnt;	
	}
	private static int loopi(int i, int[] a,int uniquecnt) {
		if(i<a.length)
		{
			int cnt=0;
			cnt=loopj(0,i,a,cnt);
			{
				if(cnt==0)
				{
					uniquecnt++;
				}
			}
			return loopi(++i,a,uniquecnt);
		}
		return uniquecnt;
	}
	private static int loopj(int j, int i, int[] a,int cnt) {
		if(j<i)
		{
			if(a[i]==a[j])
				cnt++;
			return loopj(++j,i,a,cnt);	
		}
		return cnt;
	}
}


