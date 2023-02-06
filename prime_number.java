package recursion;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=9;
		int cnt=0;
		int i=2;
		cnt=loopI(i,n,cnt);
		
		if(cnt==0)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
	public static int loopI(int i, int n, int cnt) {
		
		if(i<n)
		{
			if(n%i==0)
			{
				cnt++;
			}
			i++;
			return loopI(i,n,cnt);
			
		}
		return cnt;
	}
	
}
