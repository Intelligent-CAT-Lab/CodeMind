import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
System.out.println("[INST]9;None;scanner.hasNext();"+scanner.hasNext());
		{
			String in = scanner.nextLine();
System.out.println("[INST]11;in;scanner.nextLine();"+in);
	
			int shift = getShift(in);
			
			String out = "";
			for(int i=0; i<in.length(); i++)
System.out.println("[INST]16;None;in.length();"+in.length());
			{
				out += shiftWord(in.charAt(i), shift);
System.out.println("[INST]18;None;in.charAt(i);"+in.charAt(i));
			}
			System.out.println(out);
		}
	}
	
	static int getShift(String str)
	{
		String[] word = str.split("[ .]");
System.out.println("[INST]26;word;str.split('[ .]');"+word);
		
		for(int i=0; i<word.length; i++)
		{
			for(int j=0; j<26; j++)
			{
				String w = "";
				for(int k=0; k<word[i].length(); k++)
System.out.println("[INST]33;None;word[i].length();"+word[i].length());
				{
					w += shiftWord(word[i].charAt(k), j);
System.out.println("[INST]35;None;word[i].charAt(k);"+word[i].charAt(k));
				}
				if(w.equals("the") || w.equals("this") || w.equals("that"))
System.out.println("[INST]37;None;w.equals('the');"+w.equals("the"));
System.out.println("[INST]37;None;w.equals('this');"+w.equals("this"));
System.out.println("[INST]37;None;w.equals('that');"+w.equals("that"));
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
System.out.println("[INST]57;None;String.valueOf(w);"+String.valueOf(w));
	}
}