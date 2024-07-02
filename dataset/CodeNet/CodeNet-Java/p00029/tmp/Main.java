import java.util.Arrays;
import java.util.Scanner;

public class Main
{
	public static void main(String atg[])
	{		
		Scanner sc = new Scanner(System.in);
		String s[] = new String[2002];
		int index = 0;
		while(sc.hasNext())
System.out.println("[INST]10;None;sc.hasNext();"+sc.hasNext());
		{
			String str = sc.next();
System.out.println("[INST]12;str;sc.next();"+str);
			s[index] = str;
			index++;
		}

		int r[] = new int [index];
		boolean flag[] = new boolean[2002];
		Arrays.fill(flag, true);
System.out.println("[INST]19;None;Arrays.fill(flag, true);"+Arrays.fill(flag, true));
		int fre=0;
		for(int i=0; i<index; i++)
		{
			for(int j=i+1; j<index; j++)
			{
				if(s[i].equals(s[j])&&flag[j]==true)
System.out.println("[INST]25;None;s[i].equals(s[j]);"+s[i].equals(s[j]));
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
			if(s[max].length()<s[i].length())
System.out.println("[INST]45;None;s[max].length();"+s[max].length());
System.out.println("[INST]45;None;s[i].length();"+s[i].length());
			{
				max =i;
			}
		System.out.println(s[max]);
	}
}