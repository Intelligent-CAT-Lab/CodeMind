import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
var newVariable_0 = in.hasNext();		while(newVariable_0)
		{
var newVariable_1 = in.next();			char c[]=newVariable_1.toCharArray();
			ArrayList<String>AL=new ArrayList<String>();
			for(int i=0;i<c.length;)
			{
				if(c[i]=='e')
				{
var newVariable_2 = AL.add("e");					i+=3;
				}
				else
				{
var newVariable_3 = AL.add("c");					i+=7;
				}
			}
			int a=0;
			int b=0;
			int cnt=0;
			int max=0;
			String ans="";
var newVariable_4 = AL.size();			for(int i=0;i<newVariable_4;i++)
			{
				
var newVariable_5 = AL.get(i).equals("e");var newVariable_6 = AL.get(i);var newVariable_7 = AL.size();var newVariable_8 = AL.get(i).equals("e");var newVariable_9 = AL.get(i);				if(newVariable_9.equals("e")&&a==1||i==AL.size()-1&&newVariable_9.equals("e"))
				{
var newVariable_10 = AL.size();					if(i==newVariable_10-1)
						cnt++;
					if(cnt>max)
					{
						ans="egg";
						max=cnt;
					}
					cnt=1;
					b=0;
				}
var newVariable_11 = AL.get(i).equals("c");var newVariable_12 = AL.get(i);var newVariable_13 = AL.size();var newVariable_14 = AL.get(i).equals("c");var newVariable_15 = AL.get(i);				else if(newVariable_15.equals("c")&&b==1||i==AL.size()-1&&newVariable_15.equals("c"))
				{
var newVariable_16 = AL.size();					if(i==newVariable_16-1)
						cnt++;
					if(cnt>max)
					{
						ans="chicken";
						max=cnt;
					}
					cnt=1;
					a=0;
				}
var newVariable_17 = AL.get(i).equals("e");var newVariable_18 = AL.get(i);				else if(newVariable_18.equals("e"))
				{
					cnt++;
					a=1;
					b=0;
				}
				else
				{
					cnt++;
					a=0;
					b=1;
				}
			}
			System.out.println(ans);
		}
	}
	
	static public void debug(Object... o)
	{
		System.err.println(Arrays.deepToString(o));
	}
}