import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br = new BufferedReader(new InputStreamReader(System.in));
	}
 
    /**
     * @param args
     */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		String	stdin = null;

		while ((stdin = parseStdin()) != null) {
			String	work = "";
			String	out  = "";

			for(int loop = 0; loop < stdin.length(); loop++) {
System.out.println("[INST]23;None;stdin.length();"+stdin.length());
				work += MyConv.Encode(stdin.charAt(loop));
System.out.println("[INST]24;None;stdin.charAt(loop);"+stdin.charAt(loop));
			}

			while(work.length() % 5 != 0) {
System.out.println("[INST]27;None;work.length();"+work.length());
				work += "0";
			}

			for(int loop = 0; loop < work.length(); loop += 5) {
System.out.println("[INST]31;None;work.length();"+work.length());
				out += MyConv.Decode(work.substring(loop, loop + 5));
System.out.println("[INST]32;None;work.substring(loop, loop + 5);"+work.substring(loop, loop + 5));
			}

			System.out.println(out);
		}
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
       		stdin = br.readLine();
System.out.println("[INST]43;stdin;br.readLine();"+stdin);
        }
        catch (IOException e) {}
 
        return stdin;
	}
}

class MyConv {
	public static String Encode(char key) {
		switch (key) {
		case ' ':  return "101";
		case '\'': return "000000";
		case ',':  return "000011";
		case '-':  return "10010001";
		case '.':  return "010001";
		case '?':  return "000001";
		case 'A':  return "100101";
		case 'B':  return "10011010";
		case 'C':  return "0101";
		case 'D':  return "0001";
		case 'E':  return "110";
		case 'F':  return "01001";
		case 'G':  return "10011011";
		case 'H':  return "010000";
		case 'I':  return "0111";
		case 'J':  return "10011000";
		case 'K':  return "0110";
		case 'L':  return "00100";
		case 'M':  return "10011001";
		case 'N':  return "10011110";
		case 'O':  return "00101";
		case 'P':  return "111";
		case 'Q':  return "10011111";
		case 'R':  return "1000";
		case 'S':  return "00110";
		case 'T':  return "00111";
		case 'U':  return "10011100";
		case 'V':  return "10011101";
		case 'W':  return "000010";
		case 'X':  return "10010010";
		case 'Y':  return "10010011";
		case 'Z':  return "10010000";
		}
		return "";
	}

	public static char Decode(String key) {
		if (key.equals("00000")) return 'A';
System.out.println("[INST]91;None;key.equals('00000');"+key.equals("00000"));
		if (key.equals("00001")) return 'B';
System.out.println("[INST]92;None;key.equals('00001');"+key.equals("00001"));
		if (key.equals("00010")) return 'C';
System.out.println("[INST]93;None;key.equals('00010');"+key.equals("00010"));
		if (key.equals("00011")) return 'D';
System.out.println("[INST]94;None;key.equals('00011');"+key.equals("00011"));
		if (key.equals("00100")) return 'E';
System.out.println("[INST]95;None;key.equals('00100');"+key.equals("00100"));
		if (key.equals("00101")) return 'F';
System.out.println("[INST]96;None;key.equals('00101');"+key.equals("00101"));
		if (key.equals("00110")) return 'G';
System.out.println("[INST]97;None;key.equals('00110');"+key.equals("00110"));
		if (key.equals("00111")) return 'H';
System.out.println("[INST]98;None;key.equals('00111');"+key.equals("00111"));
		if (key.equals("01000")) return 'I';
System.out.println("[INST]99;None;key.equals('01000');"+key.equals("01000"));
		if (key.equals("01001")) return 'J';
System.out.println("[INST]100;None;key.equals('01001');"+key.equals("01001"));
		if (key.equals("01010")) return 'K';
System.out.println("[INST]101;None;key.equals('01010');"+key.equals("01010"));
		if (key.equals("01011")) return 'L';
System.out.println("[INST]102;None;key.equals('01011');"+key.equals("01011"));
		if (key.equals("01100")) return 'M';
System.out.println("[INST]103;None;key.equals('01100');"+key.equals("01100"));
		if (key.equals("01101")) return 'N';
System.out.println("[INST]104;None;key.equals('01101');"+key.equals("01101"));
		if (key.equals("01110")) return 'O';
System.out.println("[INST]105;None;key.equals('01110');"+key.equals("01110"));
		if (key.equals("01111")) return 'P';
System.out.println("[INST]106;None;key.equals('01111');"+key.equals("01111"));
		if (key.equals("10000")) return 'Q';
System.out.println("[INST]107;None;key.equals('10000');"+key.equals("10000"));
		if (key.equals("10001")) return 'R';
System.out.println("[INST]108;None;key.equals('10001');"+key.equals("10001"));
		if (key.equals("10010")) return 'S';
System.out.println("[INST]109;None;key.equals('10010');"+key.equals("10010"));
		if (key.equals("10011")) return 'T';
System.out.println("[INST]110;None;key.equals('10011');"+key.equals("10011"));
		if (key.equals("10100")) return 'U';
System.out.println("[INST]111;None;key.equals('10100');"+key.equals("10100"));
		if (key.equals("10101")) return 'V';
System.out.println("[INST]112;None;key.equals('10101');"+key.equals("10101"));
		if (key.equals("10110")) return 'W';
System.out.println("[INST]113;None;key.equals('10110');"+key.equals("10110"));
		if (key.equals("10111")) return 'X';
System.out.println("[INST]114;None;key.equals('10111');"+key.equals("10111"));
		if (key.equals("11000")) return 'Y';
System.out.println("[INST]115;None;key.equals('11000');"+key.equals("11000"));
		if (key.equals("11001")) return 'Z';
System.out.println("[INST]116;None;key.equals('11001');"+key.equals("11001"));
		if (key.equals("11010")) return ' ';
System.out.println("[INST]117;None;key.equals('11010');"+key.equals("11010"));
		if (key.equals("11011")) return '.';
System.out.println("[INST]118;None;key.equals('11011');"+key.equals("11011"));
		if (key.equals("11100")) return ',';
System.out.println("[INST]119;None;key.equals('11100');"+key.equals("11100"));
		if (key.equals("11101")) return '-';
System.out.println("[INST]120;None;key.equals('11101');"+key.equals("11101"));
		if (key.equals("11110")) return '\'';
System.out.println("[INST]121;None;key.equals('11110');"+key.equals("11110"));
		if (key.equals("11111")) return '?';
System.out.println("[INST]122;None;key.equals('11111');"+key.equals("11111"));
		return 0;
	}
}