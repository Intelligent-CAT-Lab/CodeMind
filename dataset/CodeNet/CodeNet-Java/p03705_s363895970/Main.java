import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 1行、2つ(複数)数字
		String[] ss0 = br.readLine().trim().split(" ", 0);
		long N = Integer.parseInt(ss0[0]);
		long A = Integer.parseInt(ss0[1]);
		long B = Integer.parseInt(ss0[2]);
		
		if(A>B){ System.out.println(0); return; }
		if(A==B){ System.out.println(1); return; }
		if(N==1){ System.out.println(0); return; }

		
		if(N==2){ System.out.println(1); return; }

		//if( N<(B-A+1) ) { System.out.println(0); return; }
		
		System.out.println( (B-A)*(N-2) +1 );

		return;
	}
	//-----------------------------------------------------------------
	// Debug.Print
	static void dp(String s) {
		System.out.println(s);
	}
	static void dp(StringBuilder s) { dp(s.toString()); }
	static void dp(int i) { dp(String.valueOf(i)); }
	static void dp(long i) { dp(String.valueOf(i)); }




}
