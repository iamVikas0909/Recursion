package recursion;

public class find_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7};
		int ele=40;
		
		int cnt=0;
		int i=0;
		cnt=loopI(a,cnt,ele,i);
		
		if(cnt==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("found");
		}
	}

	private static int loopI(int[] a, int cnt, int ele, int i)
	{
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(a[i]==ele)
			{
				cnt++;
			}
			
		
		i++;
		return loopI(a,cnt,ele,i);
	}
	
	return cnt;
	}

}
