
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]15;n;sc.nextInt();"+n);
		for(int i=0;;i++) {
			if( isPalin(Integer.toString(n-i)) ) {
System.out.println("[INST]17;None;Integer.toString(n-i);"+Integer.toString(n-i));
				System.out.println(n-i);
				break;
			}
			if( isPalin(Integer.toString(n+i)) ) {
System.out.println("[INST]21;None;Integer.toString(n+i);"+Integer.toString(n+i));
				System.out.println(n+i);
				break;
			}
		}
	}
	
	boolean isPalin(String s) {
		for(int i=0;i<s.length()/2;i++) 
System.out.println("[INST]29;None;s.length();"+s.length());
			if( s.charAt(i) != s.charAt(s.length()-i-1) ) return false;
System.out.println("[INST]30;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]30;None;s.charAt(s.length()-i-1);"+s.charAt(s.length()-i-1));
System.out.println("[INST]30;None;s.length();"+s.length());
		return true;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}