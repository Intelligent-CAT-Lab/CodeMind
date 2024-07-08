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

var newVariable_0 = stdin.length();			for(int loop = 0; loop < newVariable_0; loop++) {
var newVariable_1 = stdin.charAt(loop);				work += MyConv.Encode(newVariable_1);
			}

var newVariable_2 = work.length();			while(newVariable_2 % 5 != 0) {
				work += "0";
			}

var newVariable_3 = work.length();			for(int loop = 0; loop < newVariable_3; loop += 5) {
var newVariable_4 = work.substring(loop, loop + 5);				out += MyConv.Decode(newVariable_4);
			}

			System.out.println(out);
		}
	}

	private static String parseStdin() {
        String  stdin = null;
        
        try {
       		stdin = br.readLine();
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
var newVariable_5 = key.equals("00000");		if (newVariable_5) return 'A';
var newVariable_6 = key.equals("00001");		if (newVariable_6) return 'B';
var newVariable_7 = key.equals("00010");		if (newVariable_7) return 'C';
var newVariable_8 = key.equals("00011");		if (newVariable_8) return 'D';
var newVariable_9 = key.equals("00100");		if (newVariable_9) return 'E';
var newVariable_10 = key.equals("00101");		if (newVariable_10) return 'F';
var newVariable_11 = key.equals("00110");		if (newVariable_11) return 'G';
var newVariable_12 = key.equals("00111");		if (newVariable_12) return 'H';
var newVariable_13 = key.equals("01000");		if (newVariable_13) return 'I';
var newVariable_14 = key.equals("01001");		if (newVariable_14) return 'J';
var newVariable_15 = key.equals("01010");		if (newVariable_15) return 'K';
var newVariable_16 = key.equals("01011");		if (newVariable_16) return 'L';
var newVariable_17 = key.equals("01100");		if (newVariable_17) return 'M';
var newVariable_18 = key.equals("01101");		if (newVariable_18) return 'N';
var newVariable_19 = key.equals("01110");		if (newVariable_19) return 'O';
var newVariable_20 = key.equals("01111");		if (newVariable_20) return 'P';
var newVariable_21 = key.equals("10000");		if (newVariable_21) return 'Q';
var newVariable_22 = key.equals("10001");		if (newVariable_22) return 'R';
var newVariable_23 = key.equals("10010");		if (newVariable_23) return 'S';
var newVariable_24 = key.equals("10011");		if (newVariable_24) return 'T';
var newVariable_25 = key.equals("10100");		if (newVariable_25) return 'U';
var newVariable_26 = key.equals("10101");		if (newVariable_26) return 'V';
var newVariable_27 = key.equals("10110");		if (newVariable_27) return 'W';
var newVariable_28 = key.equals("10111");		if (newVariable_28) return 'X';
var newVariable_29 = key.equals("11000");		if (newVariable_29) return 'Y';
var newVariable_30 = key.equals("11001");		if (newVariable_30) return 'Z';
var newVariable_31 = key.equals("11010");		if (newVariable_31) return ' ';
var newVariable_32 = key.equals("11011");		if (newVariable_32) return '.';
var newVariable_33 = key.equals("11100");		if (newVariable_33) return ',';
var newVariable_34 = key.equals("11101");		if (newVariable_34) return '-';
var newVariable_35 = key.equals("11110");		if (newVariable_35) return '\'';
var newVariable_36 = key.equals("11111");		if (newVariable_36) return '?';
		return 0;
	}
}