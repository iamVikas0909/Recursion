package recursion;

public class saddle_point {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		loopi(a,0);
	}
	private static void loopi(int[][] a, int i) {
		if(i<a.length)
		{
			loopj(a,i,0);
			loopi(a,++i);
		}
	}
	private static void loopj(int [][]a,int i,int j) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(lowestinrow(a,i,j,0) && largestincol(a,i,j))
				System.out.println(a[i][j]);
			loopj(a,i,++j);
		}
	}
	private static boolean largestincol(int[][] a, int i, int j) {
		return loopk(a,i,j,0);	
	}
	private static boolean loopk(int[][] a, int i, int j, int k) {
		if(k<a.length)
		{
			if(a[i][j]<a[k][j])
				return false;
			return loopk(a,i,j,++k);
		}
		return true;
	}
	private static boolean lowestinrow(int[][] a, int i, int j, int k) {
		if(k<a.length)
		{
			if(a[i][j]>a[i][k])
				return false;
			return lowestinrow(a,i,j,++k);
		}
		return true;
	}

}
