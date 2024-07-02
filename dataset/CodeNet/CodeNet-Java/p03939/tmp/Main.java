import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
System.out.println("[INST]7;N;sc.nextInt();"+N);
		double d1 = sc.nextInt();
System.out.println("[INST]8;d1;sc.nextInt();"+d1);
		double x = sc.nextInt();
System.out.println("[INST]9;x;sc.nextInt();"+x);
		
		double ans = 0;
		
		for(; N>0; N--) {
			ans += d1 + (N-0.5)*x;
			d1 = ((2*N+2)*d1 + 5*x)/(2*N);
			x = ((double)N+2)/N*x;
		}
		
		System.out.println(ans);
		sc.close();
	}
}
