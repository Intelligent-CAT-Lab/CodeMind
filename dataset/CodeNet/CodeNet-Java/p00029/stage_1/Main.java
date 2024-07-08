import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String atg[])
	{		
		Scanner sc = new Scanner(System.in);
		String s[] = new String[2002];
		int index = 0;
var newVariable_0 = sc.hasNext();		while(newVariable_0)
		{
			String str = sc.next();
			s[index] = str;
			index++;
		}

		int r[] = new int [index];
		boolean flag[] = new boolean[2002];
		Arrays.fill(flag, true);
		int fre=0;
		for(int i=0; i<index; i++)
		{
			for(int j=i+1; j<index; j++)
			{
var newVariable_1 = s[i].equals(s[j]);				if(newVariable_1&&flag[j]==true)
				{
					r[i]++;
					flag[j]=false;
				}
			}
		}
		int max=0;
		int maxin=0;
		for(int i=0; i<index; i++)
		{
			if(max < r[i])
			{
				max=r[i];
				maxin = i;
			}
		}
		System.out.print(s[maxin]+" ");
		max =0;
		for(int i=0; i<index; i++)
var newVariable_2 = s[max].length();var newVariable_3 = s[i].length();			if(s[max].length()<newVariable_3)
			{
				max =i;
			}
		System.out.println(s[max]);
	}
}