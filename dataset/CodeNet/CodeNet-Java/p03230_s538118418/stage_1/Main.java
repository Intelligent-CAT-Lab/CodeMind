import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int els = 0;
		
		if(n == 1)
		{
			System.out.println("Yes");
			System.out.println("2");
			System.out.println("1 1");
			System.out.println("1 1");
			return;
		}

		int canner = 1;
		for(int i = 2; canner <= 100000; i++)
		{
			canner += i;
//			System.out.println(canner);
			if(canner == n)
			{
				System.out.println("Yes");
				els = i;
				break;
			}
		}
		if(els == 0)
		{
			System.out.println("No");
			return;
		}
		
		System.out.println((els+1));
		
		int[][] table = new int[els][els+1];
		
		int curstart = 1;
		int curend = 0;
		for(int offset = 0; offset < els; offset++)
		{
			for(int x = offset; x < els; x++)
			{
				table[x][offset] = curstart+(x-offset);
				
				curend = curstart+x-offset;
			}
			for(int y = offset+1; y <= els; y++)
			{
				table[offset][y] = (curstart+y-1-offset);
			}
			
			curstart = curend+1;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int y = 0; y <= els; y++)
		{
var newVariable_0 = sb.append(els + " ");			for(int x = 0; x < els; x++)
			{
var newVariable_1 = sb.append(' ');				if(x>0)newVariable_1;
var newVariable_2 = sb.append(table[x][y]);			}
var newVariable_3 = sb.append('\n');		}
		
		System.out.print(sb);

	}

}
