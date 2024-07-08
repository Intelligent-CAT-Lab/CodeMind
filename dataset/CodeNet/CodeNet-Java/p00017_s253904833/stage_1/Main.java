import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
var newVariable_0 = scanner.hasNext();		for(; newVariable_0;)
		{
			String in = scanner.nextLine();
	
			int shift = getShift(in);
			
			String out = "";
var newVariable_1 = in.length();			for(int i=0; i<newVariable_1; i++)
			{
var newVariable_2 = in.charAt(i);				out += shiftWord(newVariable_2, shift);
			}
			System.out.println(out);
		}
	}
	
	static int getShift(String str)
	{
		String[] word = str.split("[ .]");
		
		for(int i=0; i<word.length; i++)
		{
			for(int j=0; j<26; j++)
			{
				String w = "";
var newVariable_3 = word[i].length();				for(int k=0; k<newVariable_3; k++)
				{
var newVariable_4 = word[i].charAt(k);					w += shiftWord(newVariable_4, j);
				}
var newVariable_5 = w.equals("the");var newVariable_6 = w.equals("this");var newVariable_7 = w.equals("that");				if(w.equals("the") || w.equals("this") || newVariable_7)
				{
					return j;
				}
			}
		}
		return 0;
	}
	
	static String shiftWord(char c, int shift)
	{
		char w = c;
		if('a'<=c && c<='z')
		{
			w = (char)(c + shift);
			if(w > 'z')
			{
				w = (char)('a' + (w - 'z')  -1); 
			}
		}
var newVariable_8 = String.valueOf(w);		return newVariable_8;
	}
}