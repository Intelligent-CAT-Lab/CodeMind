import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		String str = stdIn.next();
		for(int i = 0; i < str.length(); i += 2)
		{
			if(str.charAt(i) == '0')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("wa");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("nn");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("wo");
				}
			}
			else if(str.charAt(i) == '1')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("a");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("i");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("u");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("e");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("o");
				}
			}
			else if(str.charAt(i) == '2')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("ka");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("ki");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("ku");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("ke");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("ko");
				}
			}
			else if(str.charAt(i) == '3')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("sa");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("si");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("su");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("se");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("so");
				}
			}
			else if(str.charAt(i) == '4')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("ta");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("ti");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("tu");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("te");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("to");
				}
			}
			else if(str.charAt(i) == '5')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("na");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("ni");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("nu");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("ne");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("no");
				}
			}
			else if(str.charAt(i) == '6')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("ha");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("hi");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("hu");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("he");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("ho");
				}
			}
			else if(str.charAt(i) == '7')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("ma");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("mi");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("mu");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("me");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("mo");
				}
			}
			else if(str.charAt(i) == '8')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("ya");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("yu");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("yo");
				}
			}
			else if(str.charAt(i) == '9')
			{
				if(str.charAt(i + 1) == 'T')
				{
					System.out.print("ra");
				}
				else if(str.charAt(i + 1) == 'L')
				{
					System.out.print("ri");
				}
				else if(str.charAt(i + 1) == 'U')
				{
					System.out.print("ru");
				}
				else if(str.charAt(i + 1) == 'R')
				{
					System.out.print("re");
				}
				else if(str.charAt(i + 1) == 'D')
				{
					System.out.print("ro");
				}
			}
		}
		System.out.println("");
	}
}