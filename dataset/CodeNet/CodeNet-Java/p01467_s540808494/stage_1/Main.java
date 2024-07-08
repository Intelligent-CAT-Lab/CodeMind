
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	String A, B;
	long[] pow = {(long)1, (long)1e1, (long)1e2, (long)1e3, (long)1e4, (long)1e5, (long)1e6, (long)1e7, (long)1e8, (long)1e9};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		A = sc.next(); B = sc.next();
		int k = sc.nextInt();
var newVariable_0 = A.length();var newVariable_1 = B.length();		for(int i=0;i<A.length() - newVariable_1+1;i++) B = "0" + B;
		A = "0" + A; B = "0" + B;
var newVariable_2 = new StringBuilder(A).reverse();		A = newVariable_2.toString();
var newVariable_3 = new StringBuilder(B).reverse();		B = newVariable_3.toString();
//		debug(A, B);
		System.out.println(dfs(0, k, 0));
	}
	
	long dfs(int i, int k, int b) {
var newVariable_4 = A.length();		if(newVariable_4 == i) return 0;
		long t = 0;
var newVariable_5 = A.charAt(i);var newVariable_6 = B.charAt(i);		int an = A.charAt(i) - '0', bn = newVariable_6 - '0';
		
		if( an - b >= bn) {
			long v = an - b - bn;
			t = dfs(i+1, k, 0) + v * pow[i];
		}
		else {
			long v = an - b + 10 - bn;
			t = dfs(i+1, k, 1);
			if(k > 0) t = max(t, dfs(i+1, k-1, 0));
			t += v * pow[i];
		}
		
		return t;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}