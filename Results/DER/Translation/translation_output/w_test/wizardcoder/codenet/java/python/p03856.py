Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
erasedream

Expected output:
YES


```
import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*; 
import java.util.*;
import java.util.regex.*;

/*
		  br = new BufferedReader(new FileReader("input.txt"));
		  pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
		  br = new BufferedReader(new InputStreamReader(System.in));
		  pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
 */

public class p03856 {
	private static BufferedReader br;
	private static StringTokenizer st;
	private static PrintWriter pw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		//int qq = 1;
		int qq = Integer.MAX_VALUE;
		//int qq = readInt();
		for(int casenum = 1; casenum <= qq; casenum++) {
			String s = readLine();
			String[] good = new String[] {"dream", "dreamer", "erase", "eraser"};
			boolean[] poss = new boolean[s.length()+1];
			poss[0] = true;
			for(int i = 0; i < s.length(); i++) {
				if(!poss[i]) continue;
				for(String out: good) {
					if(i + out.length() > s.length()) continue;
					int match = 0;
					for(int a = 0; a < out.length(); a++) {
						if(out.charAt(a) == s.charAt(i+a)) {
							match++;
						}
					}
					if(match == out.length()) {
						poss[i+match] = true;
					}
				}
			}
			pw.println(poss[s.length()]? "YES" : "NO");
		}
		exitImmediately();
	}

	
	private static void exitImmediately() {
		pw.close();
		System.exit(0);
	}

	private static long readLong() throws IOException {
		return Long.parseLong(readToken());
	}

	private static double readDouble() throws IOException {
		return Double.parseDouble(readToken());
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(readToken());
	}

	private static String readLine() throws IOException  {
		String s = br.readLine();
		if(s == null) {
			exitImmediately();
		}
		st = null;
		return s;
	}

	private static String readToken() throws IOException  {
		while(st == null ||!st.hasMoreTokens())  {
			st = new StringTokenizer(readLine().trim());
		}
		return st.nextToken();
	}
}
```

### Response:
```python
import java.awt.geom.*;
import java.io.*;
import java.math.*;
import java.text.*; 
import java.util.*;
import java.util.regex.*;

class p03856:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(System.in))
        self.pw = PrintWriter(BufferedWriter(OutputStreamWriter(System.out)))

    def main(self):
        try:
            qq = Integer.MAX_VALUE
            for casenum in range(1, qq+1):
                s = self.readLine()
                good = ["dream", "dreamer", "erase", "eraser"]
                poss = [False]*(len(s)+1)
                poss[0] = True
                for i in range(len(s)):
                    if not poss[i]: continue
                    for out in good:
                        if i+len(out) > len(s): continue
                        match = 0
                        for a in range(len(out)):
                            if out[a] == s[i+a]:
                                match += 1
                        if match == len(out):
                            poss[i+match] = True
                self.pw.println("YES" if poss[len(s)] else "NO")
        except Exception as e:
            print(e)
        finally:
            self.pw.close()
            System.exit(0)

    def readLong(self):
        return long(self.readToken())

    def readDouble(self):
        return float(self.readToken())

    def readInt(self):
        return int(self.readToken())

    def readLine(self):
        s = self.br.readLine()
        if s == None:
            self.exitImmediately()
        self.st = None
        return s

    def readToken(self):
        while self.st == None or not self.st.hasMoreTokens():
            self.st = StringTokenizer(self.readLine().trim())
        return self.st.nextToken()

    def exitImmediately(self):
        self.pw.close()
        System.exit(0)

p03856().main()
```<|endoftext|>
