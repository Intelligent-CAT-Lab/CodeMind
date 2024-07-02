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
			boolean[] poss = new boolean[s.length()+1];
System.out.println("[INST]28;None;s.length();"+s.length());
			poss[0] = true;
			for(int i = 0; i < s.length(); i++) {
System.out.println("[INST]30;None;s.length();"+s.length());
				if(!poss[i]) continue;
				for(String out: good) {
					if(i + out.length() > s.length()) continue;
System.out.println("[INST]33;None;out.length();"+out.length());
System.out.println("[INST]33;None;s.length();"+s.length());
					int match = 0;
					for(int a = 0; a < out.length(); a++) {
System.out.println("[INST]35;None;out.length();"+out.length());
						if(out.charAt(a) == s.charAt(i+a)) {
System.out.println("[INST]36;None;out.charAt(a);"+out.charAt(a));
System.out.println("[INST]36;None;s.charAt(i+a);"+s.charAt(i+a));
							match++;
						}
					}
					if(match == out.length()) {
System.out.println("[INST]40;None;out.length();"+out.length());
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
System.out.println("[INST]53;None;System.exit(0);"+System.exit(0));
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
System.out.println("[INST]78;None;st.hasMoreTokens();"+st.hasMoreTokens());
			st = new StringTokenizer(readLine().trim());
		}
		return st.nextToken();
System.out.println("[INST]81;None;st.nextToken();"+st.nextToken());
	}
}