package recursion;

public class sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5,6};
		int sum=0;
		
		int i=0;
		sum=loopI(i,a,sum);
		System.out.println(sum);
		double avg=sum/a.length-1;
		System.out.println(avg);
	}

	private static int loopI(int i, int[] a, int sum) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			sum=sum+a[i];
			i++;
			sum=loopI(i,a,sum);
		}
		return sum;
		
		
	}

}
