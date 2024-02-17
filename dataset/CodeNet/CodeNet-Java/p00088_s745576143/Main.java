import java.util.Scanner;
import java.util.HashMap;
class Main
{
	public static void main(String args[])
	{
		HashMap<Character, String> codeMap = new HashMap<Character, String>();
		codeMap.put(' ', "101");
		codeMap.put('\'', "000000");
		codeMap.put(',', "000011");
		codeMap.put('-', "10010001");
		codeMap.put('.', "010001");
		codeMap.put('?', "000001");
		codeMap.put('A', "100101");
		codeMap.put('B', "10011010");
		codeMap.put('C', "0101");
		codeMap.put('D', "0001");
		codeMap.put('E', "110");
		codeMap.put('F', "01001");
		codeMap.put('G', "10011011");
		codeMap.put('H', "010000");
		codeMap.put('I', "0111");
		codeMap.put('J', "10011000");
		codeMap.put('K', "0110");
		codeMap.put('L', "00100");
		codeMap.put('M', "10011001");
		codeMap.put('N', "10011110");
		codeMap.put('O', "00101");
		codeMap.put('P', "111");
		codeMap.put('Q', "10011111");
		codeMap.put('R', "1000");
		codeMap.put('S', "00110");
		codeMap.put('T', "00111");
		codeMap.put('U', "10011100");
		codeMap.put('V', "10011101");
		codeMap.put('W', "000010");
		codeMap.put('X', "10010010");
		codeMap.put('Y', "10010011");
		codeMap.put('Z', "10010000");
		HashMap<String, Character> charMap = new HashMap<String, Character>();
		charMap.put("00000", 'A');
		charMap.put("00001", 'B');
		charMap.put("00010", 'C');
		charMap.put("00011", 'D');
		charMap.put("00100", 'E');
		charMap.put("00101", 'F');
		charMap.put("00110", 'G');
		charMap.put("00111", 'H');
		charMap.put("01000", 'I');
		charMap.put("01001", 'J');
		charMap.put("01010", 'K');
		charMap.put("01011", 'L');
		charMap.put("01100", 'M');
		charMap.put("01101", 'N');
		charMap.put("01110", 'O');
		charMap.put("01111", 'P');
		charMap.put("10000", 'Q');
		charMap.put("10001", 'R');
		charMap.put("10010", 'S');
		charMap.put("10011", 'T');
		charMap.put("10100", 'U');
		charMap.put("10101", 'V');
		charMap.put("10110", 'W');
		charMap.put("10111", 'X');
		charMap.put("11000", 'Y');
		charMap.put("11001", 'Z');
		charMap.put("11010", ' ');
		charMap.put("11011", '.');
		charMap.put("11100", ',');
		charMap.put("11101", '-');
		charMap.put("11110", '\'');
		charMap.put("11111", '?');
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
		{
			String str = sc.nextLine();
			int length = str.length();
			StringBuffer codeBuf = new StringBuffer();
			for (int i = 0; i < length; i++)
			{
				codeBuf.append(codeMap.get(str.charAt(i)));
			}
			while (codeBuf.length() % 5 != 0)
			{
				codeBuf.append('0');
			}
			length = codeBuf.length();
			for (int i = 0; i < length; i += 5)
			{
				System.out.print(charMap.get(codeBuf.substring(i, i + 5)));
			}
			System.out.println();
		}
	}
}