package recursion;
public class dictionary_sort{
	public static void main(String[] args){
		String s1 = "welcome to hefshine wel";
		String []sa=s1.split(" ");
		int i=0;
		iloop(sa,i);
		for (String string : sa)
		{
			System.out.print(string+" ");
		}
	}
	private static void iloop(String[] sa, int i){
		if (i<sa.length)
		{
			int j=i+1;
			jloop(sa,i,j);
			iloop(sa, ++i);
			}
	}
	private static void jloop(String[] sa, int i, int j){
		if (j<sa.length)
		{
			if (mycompare(sa[i],sa[j],0)>0)
			{
				String temp=sa[i];
				sa[i]=sa[j];
				sa[j]=temp;
			}
			jloop(sa, i, ++j);
		}
	}
	private static int mycompare(String s1, String s2, int i){
		if (i<s1.length() && i<s2.length())
		{
			if (s1.charAt(i)!=s2.charAt(i))
			{
				return s1.charAt(i)-s2.charAt(i);
			}
			return mycompare(s1, s2, ++i);
		}
		return s1.length() -s2.length();
	}
}