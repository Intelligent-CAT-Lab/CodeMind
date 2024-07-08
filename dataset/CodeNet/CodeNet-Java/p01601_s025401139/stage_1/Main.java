import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
var newVariable_0 = in.hasNext();		while(newVariable_0)
		{
			int n=in.nextInt();
			String str=n+"";
			StringBuffer sb=new StringBuffer(str);
var newVariable_1 = sb.reverse();			String rev=newVariable_1.toString();
			int a=n-1;
			int b=n+1;
			for(;;)
			{
var newVariable_2 = str.equals(rev);				if(newVariable_2)
					break;
				str=a+"";
				sb=new StringBuffer(str);
var newVariable_3 = sb.reverse();				rev=newVariable_3.toString();
var newVariable_4 = str.equals(rev);				if(newVariable_4)
					break;
				str=b+"";
				sb=new StringBuffer(str);
var newVariable_5 = sb.reverse();				rev=newVariable_5.toString();
var newVariable_6 = str.equals(rev);				if(newVariable_6)
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