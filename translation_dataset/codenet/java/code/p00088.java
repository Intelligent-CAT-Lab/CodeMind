import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class p00088 {
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
				work += MyConv.Encode(stdin.charAt(loop));
			}

			while(work.length() % 5 != 0) {
				work += "0";
			}

			for(int loop = 0; loop < work.length(); loop += 5) {
				out += MyConv.Decode(work.substring(loop, loop + 5));
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
		if (key.equals("00000")) return 'A';
		if (key.equals("00001")) return 'B';
		if (key.equals("00010")) return 'C';
		if (key.equals("00011")) return 'D';
		if (key.equals("00100")) return 'E';
		if (key.equals("00101")) return 'F';
		if (key.equals("00110")) return 'G';
		if (key.equals("00111")) return 'H';
		if (key.equals("01000")) return 'I';
		if (key.equals("01001")) return 'J';
		if (key.equals("01010")) return 'K';
		if (key.equals("01011")) return 'L';
		if (key.equals("01100")) return 'M';
		if (key.equals("01101")) return 'N';
		if (key.equals("01110")) return 'O';
		if (key.equals("01111")) return 'P';
		if (key.equals("10000")) return 'Q';
		if (key.equals("10001")) return 'R';
		if (key.equals("10010")) return 'S';
		if (key.equals("10011")) return 'T';
		if (key.equals("10100")) return 'U';
		if (key.equals("10101")) return 'V';
		if (key.equals("10110")) return 'W';
		if (key.equals("10111")) return 'X';
		if (key.equals("11000")) return 'Y';
		if (key.equals("11001")) return 'Z';
		if (key.equals("11010")) return ' ';
		if (key.equals("11011")) return '.';
		if (key.equals("11100")) return ',';
		if (key.equals("11101")) return '-';
		if (key.equals("11110")) return '\'';
		if (key.equals("11111")) return '?';
		return 0;
	}
}