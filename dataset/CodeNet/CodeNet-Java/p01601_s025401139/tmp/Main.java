import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
System.out.println("[INST]6;None;in.hasNext();"+in.hasNext());
		{
			int n=in.nextInt();
System.out.println("[INST]8;n;in.nextInt();"+n);
			String str=n+"";
			StringBuffer sb=new StringBuffer(str);
			String rev=sb.reverse().toString();
System.out.println("[INST]11;rev;sb.reverse().toString();"+rev);
System.out.println("[INST]11;None;sb.reverse();"+sb.reverse());
			int a=n-1;
			int b=n+1;
			for(;;)
			{
				if(str.equals(rev))
System.out.println("[INST]16;None;str.equals(rev);"+str.equals(rev));
					break;
				str=a+"";
				sb=new StringBuffer(str);
				rev=sb.reverse().toString();
System.out.println("[INST]20;rev;sb.reverse().toString();"+rev);
System.out.println("[INST]20;None;sb.reverse();"+sb.reverse());
				if(str.equals(rev))
System.out.println("[INST]21;None;str.equals(rev);"+str.equals(rev));
					break;
				str=b+"";
				sb=new StringBuffer(str);
				rev=sb.reverse().toString();
System.out.println("[INST]25;rev;sb.reverse().toString();"+rev);
System.out.println("[INST]25;None;sb.reverse();"+sb.reverse());
				if(str.equals(rev))
System.out.println("[INST]26;None;str.equals(rev);"+str.equals(rev));
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