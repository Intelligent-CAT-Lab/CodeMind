/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastScanner sc=new FastScanner();
		int l=sc.nextInt(),r=sc.nextInt(),d=sc.nextInt();
		System.out.println((r/d)-(l-1)/d);
	
		
		
	}
		static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
var newVariable_0 = st.hasMoreTokens();			while (!newVariable_0)
				try {
var newVariable_1 = br.readLine();					st=new StringTokenizer(newVariable_1);
				} catch (IOException e) {
					e.printStackTrace();
				}
var newVariable_2 = st.nextToken();			return newVariable_2;
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		int[] readArray(int n) {
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		long nextLong() {
			return Long.parseLong(next());
		}
}
}
