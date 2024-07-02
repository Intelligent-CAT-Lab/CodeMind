import java.util.Scanner;
import java.util.HashMap;
class Main
{
	public static void main(String args[])
	{
		HashMap<Character, String> codeMap = new HashMap<Character, String>();
		codeMap.put(' ', "101");
System.out.println("[INST]7;None;codeMap.put(' ', '101');"+codeMap.put(' ', "101"));
		codeMap.put('\'', "000000");
System.out.println("[INST]8;None;codeMap.put('\'', '000000');"+codeMap.put('\'', "000000"));
		codeMap.put(',', "000011");
System.out.println("[INST]9;None;codeMap.put(',', '000011');"+codeMap.put(',', "000011"));
		codeMap.put('-', "10010001");
System.out.println("[INST]10;None;codeMap.put('-', '10010001');"+codeMap.put('-', "10010001"));
		codeMap.put('.', "010001");
System.out.println("[INST]11;None;codeMap.put('.', '010001');"+codeMap.put('.', "010001"));
		codeMap.put('?', "000001");
System.out.println("[INST]12;None;codeMap.put('?', '000001');"+codeMap.put('?', "000001"));
		codeMap.put('A', "100101");
System.out.println("[INST]13;None;codeMap.put('A', '100101');"+codeMap.put('A', "100101"));
		codeMap.put('B', "10011010");
System.out.println("[INST]14;None;codeMap.put('B', '10011010');"+codeMap.put('B', "10011010"));
		codeMap.put('C', "0101");
System.out.println("[INST]15;None;codeMap.put('C', '0101');"+codeMap.put('C', "0101"));
		codeMap.put('D', "0001");
System.out.println("[INST]16;None;codeMap.put('D', '0001');"+codeMap.put('D', "0001"));
		codeMap.put('E', "110");
System.out.println("[INST]17;None;codeMap.put('E', '110');"+codeMap.put('E', "110"));
		codeMap.put('F', "01001");
System.out.println("[INST]18;None;codeMap.put('F', '01001');"+codeMap.put('F', "01001"));
		codeMap.put('G', "10011011");
System.out.println("[INST]19;None;codeMap.put('G', '10011011');"+codeMap.put('G', "10011011"));
		codeMap.put('H', "010000");
System.out.println("[INST]20;None;codeMap.put('H', '010000');"+codeMap.put('H', "010000"));
		codeMap.put('I', "0111");
System.out.println("[INST]21;None;codeMap.put('I', '0111');"+codeMap.put('I', "0111"));
		codeMap.put('J', "10011000");
System.out.println("[INST]22;None;codeMap.put('J', '10011000');"+codeMap.put('J', "10011000"));
		codeMap.put('K', "0110");
System.out.println("[INST]23;None;codeMap.put('K', '0110');"+codeMap.put('K', "0110"));
		codeMap.put('L', "00100");
System.out.println("[INST]24;None;codeMap.put('L', '00100');"+codeMap.put('L', "00100"));
		codeMap.put('M', "10011001");
System.out.println("[INST]25;None;codeMap.put('M', '10011001');"+codeMap.put('M', "10011001"));
		codeMap.put('N', "10011110");
System.out.println("[INST]26;None;codeMap.put('N', '10011110');"+codeMap.put('N', "10011110"));
		codeMap.put('O', "00101");
System.out.println("[INST]27;None;codeMap.put('O', '00101');"+codeMap.put('O', "00101"));
		codeMap.put('P', "111");
System.out.println("[INST]28;None;codeMap.put('P', '111');"+codeMap.put('P', "111"));
		codeMap.put('Q', "10011111");
System.out.println("[INST]29;None;codeMap.put('Q', '10011111');"+codeMap.put('Q', "10011111"));
		codeMap.put('R', "1000");
System.out.println("[INST]30;None;codeMap.put('R', '1000');"+codeMap.put('R', "1000"));
		codeMap.put('S', "00110");
System.out.println("[INST]31;None;codeMap.put('S', '00110');"+codeMap.put('S', "00110"));
		codeMap.put('T', "00111");
System.out.println("[INST]32;None;codeMap.put('T', '00111');"+codeMap.put('T', "00111"));
		codeMap.put('U', "10011100");
System.out.println("[INST]33;None;codeMap.put('U', '10011100');"+codeMap.put('U', "10011100"));
		codeMap.put('V', "10011101");
System.out.println("[INST]34;None;codeMap.put('V', '10011101');"+codeMap.put('V', "10011101"));
		codeMap.put('W', "000010");
System.out.println("[INST]35;None;codeMap.put('W', '000010');"+codeMap.put('W', "000010"));
		codeMap.put('X', "10010010");
System.out.println("[INST]36;None;codeMap.put('X', '10010010');"+codeMap.put('X', "10010010"));
		codeMap.put('Y', "10010011");
System.out.println("[INST]37;None;codeMap.put('Y', '10010011');"+codeMap.put('Y', "10010011"));
		codeMap.put('Z', "10010000");
System.out.println("[INST]38;None;codeMap.put('Z', '10010000');"+codeMap.put('Z', "10010000"));
		HashMap<String, Character> charMap = new HashMap<String, Character>();
		charMap.put("00000", 'A');
System.out.println("[INST]40;None;charMap.put('00000', 'A');"+charMap.put("00000", 'A'));
		charMap.put("00001", 'B');
System.out.println("[INST]41;None;charMap.put('00001', 'B');"+charMap.put("00001", 'B'));
		charMap.put("00010", 'C');
System.out.println("[INST]42;None;charMap.put('00010', 'C');"+charMap.put("00010", 'C'));
		charMap.put("00011", 'D');
System.out.println("[INST]43;None;charMap.put('00011', 'D');"+charMap.put("00011", 'D'));
		charMap.put("00100", 'E');
System.out.println("[INST]44;None;charMap.put('00100', 'E');"+charMap.put("00100", 'E'));
		charMap.put("00101", 'F');
System.out.println("[INST]45;None;charMap.put('00101', 'F');"+charMap.put("00101", 'F'));
		charMap.put("00110", 'G');
System.out.println("[INST]46;None;charMap.put('00110', 'G');"+charMap.put("00110", 'G'));
		charMap.put("00111", 'H');
System.out.println("[INST]47;None;charMap.put('00111', 'H');"+charMap.put("00111", 'H'));
		charMap.put("01000", 'I');
System.out.println("[INST]48;None;charMap.put('01000', 'I');"+charMap.put("01000", 'I'));
		charMap.put("01001", 'J');
System.out.println("[INST]49;None;charMap.put('01001', 'J');"+charMap.put("01001", 'J'));
		charMap.put("01010", 'K');
System.out.println("[INST]50;None;charMap.put('01010', 'K');"+charMap.put("01010", 'K'));
		charMap.put("01011", 'L');
System.out.println("[INST]51;None;charMap.put('01011', 'L');"+charMap.put("01011", 'L'));
		charMap.put("01100", 'M');
System.out.println("[INST]52;None;charMap.put('01100', 'M');"+charMap.put("01100", 'M'));
		charMap.put("01101", 'N');
System.out.println("[INST]53;None;charMap.put('01101', 'N');"+charMap.put("01101", 'N'));
		charMap.put("01110", 'O');
System.out.println("[INST]54;None;charMap.put('01110', 'O');"+charMap.put("01110", 'O'));
		charMap.put("01111", 'P');
System.out.println("[INST]55;None;charMap.put('01111', 'P');"+charMap.put("01111", 'P'));
		charMap.put("10000", 'Q');
System.out.println("[INST]56;None;charMap.put('10000', 'Q');"+charMap.put("10000", 'Q'));
		charMap.put("10001", 'R');
System.out.println("[INST]57;None;charMap.put('10001', 'R');"+charMap.put("10001", 'R'));
		charMap.put("10010", 'S');
System.out.println("[INST]58;None;charMap.put('10010', 'S');"+charMap.put("10010", 'S'));
		charMap.put("10011", 'T');
System.out.println("[INST]59;None;charMap.put('10011', 'T');"+charMap.put("10011", 'T'));
		charMap.put("10100", 'U');
System.out.println("[INST]60;None;charMap.put('10100', 'U');"+charMap.put("10100", 'U'));
		charMap.put("10101", 'V');
System.out.println("[INST]61;None;charMap.put('10101', 'V');"+charMap.put("10101", 'V'));
		charMap.put("10110", 'W');
System.out.println("[INST]62;None;charMap.put('10110', 'W');"+charMap.put("10110", 'W'));
		charMap.put("10111", 'X');
System.out.println("[INST]63;None;charMap.put('10111', 'X');"+charMap.put("10111", 'X'));
		charMap.put("11000", 'Y');
System.out.println("[INST]64;None;charMap.put('11000', 'Y');"+charMap.put("11000", 'Y'));
		charMap.put("11001", 'Z');
System.out.println("[INST]65;None;charMap.put('11001', 'Z');"+charMap.put("11001", 'Z'));
		charMap.put("11010", ' ');
System.out.println("[INST]66;None;charMap.put('11010', ' ');"+charMap.put("11010", ' '));
		charMap.put("11011", '.');
System.out.println("[INST]67;None;charMap.put('11011', '.');"+charMap.put("11011", '.'));
		charMap.put("11100", ',');
System.out.println("[INST]68;None;charMap.put('11100', ',');"+charMap.put("11100", ','));
		charMap.put("11101", '-');
System.out.println("[INST]69;None;charMap.put('11101', '-');"+charMap.put("11101", '-'));
		charMap.put("11110", '\'');
System.out.println("[INST]70;None;charMap.put('11110', '\'');"+charMap.put("11110", '\''));
		charMap.put("11111", '?');
System.out.println("[INST]71;None;charMap.put('11111', '?');"+charMap.put("11111", '?'));
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext())
System.out.println("[INST]73;None;sc.hasNext();"+sc.hasNext());
		{
			String str = sc.nextLine();
System.out.println("[INST]75;str;sc.nextLine();"+str);
			int length = str.length();
System.out.println("[INST]76;length;str.length();"+length);
			StringBuffer codeBuf = new StringBuffer();
			for (int i = 0; i < length; i++)
			{
				codeBuf.append(codeMap.get(str.charAt(i)));
System.out.println("[INST]80;None;codeBuf.append(codeMap.get(str.charAt(i)));"+codeBuf.append(codeMap.get(str.charAt(i))));
System.out.println("[INST]80;None;codeMap.get(str.charAt(i));"+codeMap.get(str.charAt(i)));
System.out.println("[INST]80;None;str.charAt(i);"+str.charAt(i));
			}
			while (codeBuf.length() % 5 != 0)
System.out.println("[INST]82;None;codeBuf.length();"+codeBuf.length());
			{
				codeBuf.append('0');
System.out.println("[INST]84;None;codeBuf.append('0');"+codeBuf.append('0'));
			}
			length = codeBuf.length();
System.out.println("[INST]86;length;codeBuf.length();"+length);
			for (int i = 0; i < length; i += 5)
			{
				System.out.print(charMap.get(codeBuf.substring(i, i + 5)));
			}
			System.out.println();
		}
	}
}