
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
		for(int i=0;;i++) {
var newVariable_0 = Integer.toString(n-i);			if( isPalin(newVariable_0) ) {
				System.out.println(n-i);
				break;
			}
var newVariable_1 = Integer.toString(n+i);			if( isPalin(newVariable_1) ) {
				System.out.println(n+i);
				break;
			}
		}
	}
	
	boolean isPalin(String s) {
var newVariable_2 = s.length();		for(int i=0;i<newVariable_2/2;i++) 
var newVariable_3 = s.charAt(i);var newVariable_4 = s.charAt(s.length()-i-1);var newVariable_5 = s.length();			if( s.charAt(i) != s.charAt(newVariable_5-i-1) ) return false;
		return true;
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}