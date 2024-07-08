import java.util.Scanner;
import java.util.HashMap;
class Main
{
	public static void main(String args[])
	{
		HashMap<Character, String> codeMap = new HashMap<Character, String>();
var newVariable_0 = codeMap.put(' ', "101");var newVariable_1 = codeMap.put('\'', "000000");var newVariable_2 = codeMap.put(',', "000011");var newVariable_3 = codeMap.put('-', "10010001");var newVariable_4 = codeMap.put('.', "010001");var newVariable_5 = codeMap.put('?', "000001");var newVariable_6 = codeMap.put('A', "100101");var newVariable_7 = codeMap.put('B', "10011010");var newVariable_8 = codeMap.put('C', "0101");var newVariable_9 = codeMap.put('D', "0001");var newVariable_10 = codeMap.put('E', "110");var newVariable_11 = codeMap.put('F', "01001");var newVariable_12 = codeMap.put('G', "10011011");var newVariable_13 = codeMap.put('H', "010000");var newVariable_14 = codeMap.put('I', "0111");var newVariable_15 = codeMap.put('J', "10011000");var newVariable_16 = codeMap.put('K', "0110");var newVariable_17 = codeMap.put('L', "00100");var newVariable_18 = codeMap.put('M', "10011001");var newVariable_19 = codeMap.put('N', "10011110");var newVariable_20 = codeMap.put('O', "00101");var newVariable_21 = codeMap.put('P', "111");var newVariable_22 = codeMap.put('Q', "10011111");var newVariable_23 = codeMap.put('R', "1000");var newVariable_24 = codeMap.put('S', "00110");var newVariable_25 = codeMap.put('T', "00111");var newVariable_26 = codeMap.put('U', "10011100");var newVariable_27 = codeMap.put('V', "10011101");var newVariable_28 = codeMap.put('W', "000010");var newVariable_29 = codeMap.put('X', "10010010");var newVariable_30 = codeMap.put('Y', "10010011");var newVariable_31 = codeMap.put('Z', "10010000");		HashMap<String, Character> charMap = new HashMap<String, Character>();
var newVariable_32 = charMap.put("00000", 'A');var newVariable_33 = charMap.put("00001", 'B');var newVariable_34 = charMap.put("00010", 'C');var newVariable_35 = charMap.put("00011", 'D');var newVariable_36 = charMap.put("00100", 'E');var newVariable_37 = charMap.put("00101", 'F');var newVariable_38 = charMap.put("00110", 'G');var newVariable_39 = charMap.put("00111", 'H');var newVariable_40 = charMap.put("01000", 'I');var newVariable_41 = charMap.put("01001", 'J');var newVariable_42 = charMap.put("01010", 'K');var newVariable_43 = charMap.put("01011", 'L');var newVariable_44 = charMap.put("01100", 'M');var newVariable_45 = charMap.put("01101", 'N');var newVariable_46 = charMap.put("01110", 'O');var newVariable_47 = charMap.put("01111", 'P');var newVariable_48 = charMap.put("10000", 'Q');var newVariable_49 = charMap.put("10001", 'R');var newVariable_50 = charMap.put("10010", 'S');var newVariable_51 = charMap.put("10011", 'T');var newVariable_52 = charMap.put("10100", 'U');var newVariable_53 = charMap.put("10101", 'V');var newVariable_54 = charMap.put("10110", 'W');var newVariable_55 = charMap.put("10111", 'X');var newVariable_56 = charMap.put("11000", 'Y');var newVariable_57 = charMap.put("11001", 'Z');var newVariable_58 = charMap.put("11010", ' ');var newVariable_59 = charMap.put("11011", '.');var newVariable_60 = charMap.put("11100", ',');var newVariable_61 = charMap.put("11101", '-');var newVariable_62 = charMap.put("11110", '\'');var newVariable_63 = charMap.put("11111", '?');		Scanner sc = new Scanner(System.in);
var newVariable_64 = sc.hasNext();		while (newVariable_64)
		{
			String str = sc.nextLine();
			int length = str.length();
			StringBuffer codeBuf = new StringBuffer();
			for (int i = 0; i < length; i++)
			{
var newVariable_65 = codeBuf.append(codeMap.get(str.charAt(i)));var newVariable_66 = codeMap.get(str.charAt(i));var newVariable_67 = str.charAt(i);				codeBuf.append(codeMap.get(newVariable_67));
			}
var newVariable_68 = codeBuf.length();			while (newVariable_68 % 5 != 0)
			{
var newVariable_69 = codeBuf.append('0');			}
			length = codeBuf.length();
			for (int i = 0; i < length; i += 5)
			{
				System.out.print(charMap.get(codeBuf.substring(i, i + 5)));
			}
			System.out.println();
		}
	}
}