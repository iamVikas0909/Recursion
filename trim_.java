package recursion;

public class trim_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1="      abcd        ";



		int i = 0;
		int j = s1.length() - 1;

		loopi(s1,i,j);

		String s2 = "";
		for (int k = i; k <= j; k++) 
		{

			s2 = s2 + s1.charAt(k);
			
		}
		System.out.println(s2);
	}

	private static void loopi(String s1, int i, int j) 
	{
		if(true)
		{

			if (s1.charAt(i) == ' ') 
			{
				i++;
			}
			else if(s1.charAt(j)==' ')
			{
				j--;
			}
			else 
			{
				return;
			}

		}

	}

}
