
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
System.out.println("[INST]17;A;sc.next();"+A);
System.out.println("[INST]17;B;sc.next();"+B);
		int k = sc.nextInt();
System.out.println("[INST]18;k;sc.nextInt();"+k);
		for(int i=0;i<A.length() - B.length()+1;i++) B = "0" + B;
System.out.println("[INST]19;None;A.length();"+A.length());
System.out.println("[INST]19;None;B.length();"+B.length());
		A = "0" + A; B = "0" + B;
		A = new StringBuilder(A).reverse().toString();
System.out.println("[INST]21;A;new StringBuilder(A).reverse().toString();"+A);
System.out.println("[INST]21;None;new StringBuilder(A).reverse();"+new StringBuilder(A).reverse());
		B = new StringBuilder(B).reverse().toString();
System.out.println("[INST]22;B;new StringBuilder(B).reverse().toString();"+B);
System.out.println("[INST]22;None;new StringBuilder(B).reverse();"+new StringBuilder(B).reverse());
//		debug(A, B);
		System.out.println(dfs(0, k, 0));
	}
	
	long dfs(int i, int k, int b) {
		if(A.length() == i) return 0;
System.out.println("[INST]28;None;A.length();"+A.length());
		long t = 0;
		int an = A.charAt(i) - '0', bn = B.charAt(i) - '0';
System.out.println("[INST]30;None;A.charAt(i);"+A.charAt(i));
System.out.println("[INST]30;None;B.charAt(i);"+B.charAt(i));
		
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