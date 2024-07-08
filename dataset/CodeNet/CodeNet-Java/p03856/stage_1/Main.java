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

public class Main {
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
var newVariable_0 = s.length();			boolean[] poss = new boolean[newVariable_0+1];
			poss[0] = true;
var newVariable_1 = s.length();			for(int i = 0; i < newVariable_1; i++) {
				if(!poss[i]) continue;
				for(String out: good) {
var newVariable_2 = out.length();var newVariable_3 = s.length();					if(i + out.length() > newVariable_3) continue;
					int match = 0;
var newVariable_4 = out.length();					for(int a = 0; a < newVariable_4; a++) {
var newVariable_5 = out.charAt(a);var newVariable_6 = s.charAt(i+a);						if(out.charAt(a) == newVariable_6) {
							match++;
						}
					}
var newVariable_7 = out.length();					if(match == newVariable_7) {
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
var newVariable_8 = st.hasMoreTokens();		while(st == null || !newVariable_8)  {
			st = new StringTokenizer(readLine().trim());
		}
var newVariable_9 = st.nextToken();		return newVariable_9;
	}
}