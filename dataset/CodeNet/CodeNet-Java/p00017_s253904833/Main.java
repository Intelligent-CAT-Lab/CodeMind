import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			String in = scanner.nextLine();
	
			int shift = getShift(in);
			
			String out = "";
			for(int i=0; i<in.length(); i++)
			{
				out += shiftWord(in.charAt(i), shift);
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
				for(int k=0; k<word[i].length(); k++)
				{
					w += shiftWord(word[i].charAt(k), j);
				}
				if(w.equals("the") || w.equals("this") || w.equals("that"))
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
		return String.valueOf(w);
	}
}