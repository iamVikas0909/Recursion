package recursion;

public class compare_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s1="abcd";
		String s2="abcd";

		int ans=mycompare(s1,s2);
		System.out.println(ans);
	}

	private static int mycompare(String s1, String s2) {
		// TODO Auto-generated method stub

		int diff=loopi(s1,s2,0);
		return diff;
	}

	private static int loopi(String s1, String s2, int i) {
		// TODO Auto-generated method stub


		if(i<s1.length() && i<s2.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
					return s1.charAt(i)-s2.charAt(i);			
							i++;
			return loopi(s1,s2,i);
		}
		return s1.length()-s2.length();
	}

}
