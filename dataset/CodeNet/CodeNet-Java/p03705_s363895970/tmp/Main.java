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
System.out.println("[INST]11;ss0;br.readLine().trim().split(' ', 0);"+ss0);
System.out.println("[INST]11;None;br.readLine().trim();"+br.readLine().trim());
System.out.println("[INST]11;None;br.readLine();"+br.readLine());
		long N = Integer.parseInt(ss0[0]);
System.out.println("[INST]12;N;Integer.parseInt(ss0[0]);"+N);
		long A = Integer.parseInt(ss0[1]);
System.out.println("[INST]13;A;Integer.parseInt(ss0[1]);"+A);
		long B = Integer.parseInt(ss0[2]);
System.out.println("[INST]14;B;Integer.parseInt(ss0[2]);"+B);
		
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
System.out.println("[INST]34;None;s.toString();"+s.toString());
	static void dp(int i) { dp(String.valueOf(i)); }
System.out.println("[INST]35;None;String.valueOf(i);"+String.valueOf(i));
	static void dp(long i) { dp(String.valueOf(i)); }
System.out.println("[INST]36;None;String.valueOf(i);"+String.valueOf(i));




}
