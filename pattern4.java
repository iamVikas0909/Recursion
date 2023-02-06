package recursion;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int irange=9;
		int jrange=9;
		int i=0;
		
		loopI(i,irange,jrange);
	}

	private static void loopI(int i,int irange,int jrange) {
		// TODO Auto-generated method stub
		if(i<irange)
		{
			int j=0;
			int cnt=1;
			loopJ(i,j,irange,jrange,cnt);
			System.out.println();
			i++;
			loopI(i,irange,jrange);
		}
	}

	private static void loopJ(int i, int j, int irange, int jrange,int cnt) {
		// TODO Auto-generated method stub
		if(j<jrange)
		{
			if(j-i<=0)
				System.out.print(cnt++);
			else
				System.out.print(" ");
			j++;
			loopJ(i,j,irange,jrange,cnt);
		}
	}

}
