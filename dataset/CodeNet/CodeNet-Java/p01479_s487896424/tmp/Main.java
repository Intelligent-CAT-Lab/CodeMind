import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
System.out.println("[INST]6;None;in.hasNext();"+in.hasNext());
		{
			char c[]=in.next().toCharArray();
System.out.println("[INST]8;c;in.next().toCharArray();"+c);
System.out.println("[INST]8;None;in.next();"+in.next());
			ArrayList<String>AL=new ArrayList<String>();
			for(int i=0;i<c.length;)
			{
				if(c[i]=='e')
				{
					AL.add("e");
System.out.println("[INST]14;None;AL.add('e');"+AL.add("e"));
					i+=3;
				}
				else
				{
					AL.add("c");
System.out.println("[INST]19;None;AL.add('c');"+AL.add("c"));
					i+=7;
				}
			}
			int a=0;
			int b=0;
			int cnt=0;
			int max=0;
			String ans="";
			for(int i=0;i<AL.size();i++)
System.out.println("[INST]28;None;AL.size();"+AL.size());
			{
				
				if(AL.get(i).equals("e")&&a==1||i==AL.size()-1&&AL.get(i).equals("e"))
System.out.println("[INST]31;None;AL.get(i).equals('e');"+AL.get(i).equals("e"));
System.out.println("[INST]31;None;AL.get(i);"+AL.get(i));
System.out.println("[INST]31;None;AL.size();"+AL.size());
System.out.println("[INST]31;None;AL.get(i).equals('e');"+AL.get(i).equals("e"));
System.out.println("[INST]31;None;AL.get(i);"+AL.get(i));
				{
					if(i==AL.size()-1)
System.out.println("[INST]33;None;AL.size();"+AL.size());
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
System.out.println("[INST]43;None;AL.get(i).equals('c');"+AL.get(i).equals("c"));
System.out.println("[INST]43;None;AL.get(i);"+AL.get(i));
System.out.println("[INST]43;None;AL.size();"+AL.size());
System.out.println("[INST]43;None;AL.get(i).equals('c');"+AL.get(i).equals("c"));
System.out.println("[INST]43;None;AL.get(i);"+AL.get(i));
				{
					if(i==AL.size()-1)
System.out.println("[INST]45;None;AL.size();"+AL.size());
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
System.out.println("[INST]55;None;AL.get(i).equals('e');"+AL.get(i).equals("e"));
System.out.println("[INST]55;None;AL.get(i);"+AL.get(i));
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