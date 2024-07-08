import java.util.*;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
var newVariable_0 = String.valueOf(i).length();var newVariable_1 = String.valueOf(i);			if(newVariable_1.length()%2 != 0)
			{c++;}
		}
		System.out.println(c);
	}
}