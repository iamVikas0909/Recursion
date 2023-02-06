 package recursion;

public class index_of {

	public static void main(String[] args) {
		String s1="abcd";
		String s2="cd";
		loopi(s1,s2,0);
	}
	private static void loopi(String s1, String s2, int i)
	{
		if(i<s1.length())
		{


			if(s1.charAt(i)==s2.charAt(0))
			{
				int s1Index=i;
				int s2Index=0;
				int cnt=0;
				
				cnt=loopj(s1,s2,s1Index,s2Index,cnt);

				if(cnt==0)
				{
					System.out.println(i);
					return;
				}
			}
			i++;
			loopi(s1,s2,i);
		}
	}

	private static int loopj(String s1, String s2, int s1Index, int s2Index, int cnt) 
	{

		if(s2Index<s2.length())
		{
			if(s1.charAt(s1Index)!=s2.charAt(s2Index))
			{
				cnt++;
				return cnt;
			}

			s1Index++;
			s2Index++;
			return loopj(s1,s2,s1Index,s2Index,cnt);
		}
		return cnt;
	}

}
