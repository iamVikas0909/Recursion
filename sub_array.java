package recursion;



public class sub_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {3,7,9,1,4,58,6,5,};
		
		int size=3;
		int min=a[0];
		int index=0;
		loopi(0,a,size,min,index);
		System.out.println(index+" "+min);
	}
	private static void loopi(int i, int[] a, int size,int min,int index) {
		// TODO Auto-generated method stub
		if(i<=a.length-size)
		{
			int sum=0;
			int j=i;
			sum=loopj(j,i,sum,a,size);
			if(sum<min)
				min=sum;
			index=i;

			loopi(++i,a,size,min,index);
		}
	}
	private static int loopj(int j, int i, int sum, int[] a, int size) {
		// TODO Auto-generated method stub
		if(j<i+size)
		{
			sum=sum+a[j];
			return loopj(++j,i,sum,a,size);
		}
		return sum;

	}

}
