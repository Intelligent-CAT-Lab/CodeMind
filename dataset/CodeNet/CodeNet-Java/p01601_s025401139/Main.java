import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			int n=in.nextInt();
			String str=n+"";
			StringBuffer sb=new StringBuffer(str);
			String rev=sb.reverse().toString();
			int a=n-1;
			int b=n+1;
			for(;;)
			{
				if(str.equals(rev))
					break;
				str=a+"";
				sb=new StringBuffer(str);
				rev=sb.reverse().toString();
				if(str.equals(rev))
					break;
				str=b+"";
				sb=new StringBuffer(str);
				rev=sb.reverse().toString();
				if(str.equals(rev))
					break;
				a--;
				b++;
			}
			System.out.println(str);
		}
	}
	
	static public void debug(Object... o)
	{
		System.out.println(Arrays.deepToString(o));
	}
}