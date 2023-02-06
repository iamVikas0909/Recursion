package recursion;

public class print_by_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for (int i = 11; i <=20; i++)
	{
	System.out.println(i);	
	}
	System.out.println("--------");
	
	int i=11;
	loopi(i);
	}
		private static void loopi(int i)
		{
			if(i<=20)
			{
				System.out.println(i);
				i++;
				loopi(i);
			}
		}
	}

