package recursion;

public class Starts_with {

	public static void main(String[] args) {
		
		String s1 ="abcd";
		String s2 ="ad";
		
		boolean ans=myStartswith(s1,s2);
		System.out.println(ans);
	}

	private static boolean myStartswith(String s1, String s2) {
		// TODO Auto-generated method stub
		
		if(s2.length()<=s1.length())
		{
			int i=0;
			return loopi(s1,s2,i);
		}
		else 
			
		return false;
	}

	private static boolean loopi(String s1, String s2, int i) {
		// TODO Auto-generated method stub
		
		if(i<s2.length())
		{
			
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
			i++;
			return loopi(s1,s2,i);
		}
		return true;
	}
}
