import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.math.*;

public class p01989 {

	static void solve (FastScanner in, PrintWriter out, Methods ms) {
		
		String s = in.next();
		int length = s.length();
		int ans = 0;
		
		for (int i=1; i<length-2; i++) {
			for (int j=i+1; j<length-1; j++) {
				loop : for (int k=j+1; k<length; k++) {
					
					String[] a = {s.substring(0,i), s.substring(i,j), s.substring(j,k), s.substring(k,length)};
					
					for (int x=0; x<4; x++) {
						if (a[x].length()!= String.valueOf(Integer.parseInt(a[x])).length()) {
							continue loop;
						}
					}
					
					int[] b = {Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]), Integer.parseInt(a[3])};
					if (b[0]<=255 && b[1]<=255 && b[2]<=255 && b[3]<=255) ans++;
					
				}
			}
		}
		
		out.println(ans);
		
	}
	

	public static void main(String[] args) {
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		solve(in, out, ms);
		in.close();
		out.close();
	}

	static class Methods {

		public void print (Object... ar) {System