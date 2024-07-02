import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
System.out.println("[INST]8;a;sc.nextInt();"+a);
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2 != 0)
System.out.println("[INST]11;None;String.valueOf(i).length();"+String.valueOf(i).length());
System.out.println("[INST]11;None;String.valueOf(i);"+String.valueOf(i));
			{c++;}
		}
		System.out.println(c);
	}
}