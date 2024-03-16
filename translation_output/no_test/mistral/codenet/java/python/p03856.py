<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
			pw.println(poss[s.length()] ? "YES" : "NO");
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
		while(st == null || !st.hasMoreTokens())  {
			st = new StringTokenizer(readLine().trim());
		}
		return st.nextToken();
	}
}
```
[/INST]
```python
import java.io
import java.util
import java.util.regex

# br = new BufferedReader(new FileReader("input.txt"));
# pw = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
# br = new BufferedReader(new InputStreamReader(System.in));
# pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

def main():
    br = java.io.BufferedReader(java.io.FileReader("input.txt"))
    pw = java.io.PrintWriter(java.io.BufferedWriter(java.io.FileWriter("output.txt")))
    qq = int(input())
    for casenum in range(1, qq+1):
        s = input()
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [False] * (len(s)+1)
        poss[0] = True
        for i in range(len(s)):
            if not poss[i]:
                continue
            for out in good:
                if i + len(out) > len(s):
                    continue
                match = 0
                for a in range(len(out)):
                    if s[i+a] == out[a]:
                        match += 1
                if match == len(out):
                    poss[i+match] = True
        pw.write("YES\n" if poss[len(s)] else "NO\n")
    exitImmediately()

def exitImmediately():
    pw.close()
    sys.exit(0)

def input():
    return int(inputToken())

def readLong():
    return long(inputToken())

def readDouble():
    return float(inputToken())

def readInt():
    return int(inputToken())

def readLine():
    s = br.readLine()
    if s == None:
        exitImmediately()
    st = None
    return s

def readToken():
    while st == None or not st.hasMoreTokens():
        s = readLine().trim()
        st = StringTokenizer(s)
    return st.nextToken()

main()
```</s>
