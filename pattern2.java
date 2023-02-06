package recursion;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=0;
		loopI(i);
	}

	private static void loopI(int i) {
		// TODO Auto-generated method stub
		if(i<9)
		{
			int j=0;
			loopJ(i,j);
			System.out.println();
			i++;
			loopI(i);
		}
		
	}

	private static void loopJ(int i, int j) {
		// TODO Auto-generated method stub
		if(j<5)
		{
			if(j-i<=0 && j+i<=8)
				System.out.print("*");
			else
			System.out.print(" ");
			j++;
			loopJ(i,j);
		}
		
	}

}
