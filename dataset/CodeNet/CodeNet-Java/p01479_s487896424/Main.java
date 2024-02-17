import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			char c[]=in.next().toCharArray();
			ArrayList<String>AL=new ArrayList<String>();
			for(int i=0;i<c.length;)
			{
				if(c[i]=='e')
				{
					AL.add("e");
					i+=3;
				}
				else
				{
					AL.add("c");
					i+=7;
				}
			}
			int a=0;
			int b=0;
			int cnt=0;
			int max=0;
			String ans="";
			for(int i=0;i<AL.size();i++)
			{
				
				if(AL.get(i).equals("e")&&a==1||i==AL.size()-1&&AL.get(i).equals("e"))
				{
					if(i==AL.size()-1)
						cnt++;
					if(cnt>max)
					{
						ans="egg";
						max=cnt;
					}
					cnt=1;
					b=0;
				}
				else if(AL.get(i).equals("c")&&b==1||i==AL.size()-1&&AL.get(i).equals("c"))
				{
					if(i==AL.size()-1)
						cnt++;
					if(cnt>max)
					{
						ans="chicken";
						max=cnt;
					}
					cnt=1;
					a=0;
				}
				else if(AL.get(i).equals("e"))
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