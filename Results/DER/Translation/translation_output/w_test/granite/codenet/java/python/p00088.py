System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
PETER POTTER

Expected output:
?D-C'KOPUA


```
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

		while ((stdin = parseStdin())!= null) {
			String	work = "";
			String	out  = "";

			for(int loop = 0; loop < stdin.length(); loop++) {
				work += MyConv.Encode(stdin.charAt(loop));
			}

			while(work.length() % 5!= 0) {
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
		case'':  return "101";
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
		if (key.equals("11010")) return'';
		if (key.equals("11011")) return '.';
		if (key.equals("11100")) return ',';
		if (key.equals("11101")) return '-';
		if (key.equals("11110")) return '\'';
		if (key.equals("11111")) return '?';
		return 0;
	}
}
```


Answer:
```python
import sys

class MyConv:
    @staticmethod
    def encode(key):
        switcher = {
           '':  '101',
            '\'': '000000',
            ',':  '000011',
            '-':  '10010001',
            '.':  '010001',
            '?':  '000001',
            'A':  '100101',
            'B':  '10011010',
            'C':  '0101',
            'D':  '0001',
            'E':  '110',
            'F':  '01001',
            'G':  '10011011',
            'H':  '010000',
            'I':  '0111',
            'J':  '10011000',
            'K':  '0110',
            'L':  '00100',
            'M':  '10011001',
            'N':  '10011110',
            'O':  '00101',
            'P':  '111',
            'Q':  '10011111',
            'R':  '1000',
            'S':  '00110',
            'T':  '00111',
            'U':  '10011100',
            'V':  '10011101',
            'W':  '000010',
            'X':  '10010010',
            'Y':  '10010011',
            'Z':  '10010000',
        }
        return switcher.get(key, "")

    @staticmethod
    def decode(key):
        switcher = {
            "00000": "A",
            "00001": "B",
            "00010": "C",
            "00011": "D",
            "00100": "E",
            "00101": "F",
            "00110": "G",
            "00111": "H",
            "01000": "I",
            "01001": "J",
            "01010": "K",
            "01011": "L",
            "01100": "M",
            "01101": "N",
            "01110": "O",
            "01111": "P",
            "10000": "Q",
            "10001": "R",
            "10010": "S",
            "10011": "T",
            "10100": "U",
            "10101": "V",
            "10110": "W",
            "10111": "X",
            "11000": "Y",
            "11001": "Z",
            "11010": " ",
            "11011": ".",
            "11100": ",",
            "11101": "-",
            "11110": "'",
            "11111": "?",
        }
        return switcher.get(key, "")

def main():
    while True:
        try:
            line = input()
        except EOFError:
            break

        work = ""
        out = ""

        for char in line:
            work += MyConv.encode(char)

        while len(work) % 5!= 0:
            work += "0"

        for i in range(0, len(work), 5):
            out += MyConv.decode(work[i:i+5])

        print(out)

if __name__ == "__main__":
    main()
```<|endoftext|>
