import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long X = Math.abs(stdIn.nextLong());
System.out.println("[INST]5;X;Math.abs(stdIn.nextLong());"+X);
System.out.println("[INST]5;None;stdIn.nextLong();"+stdIn.nextLong());
		long K = stdIn.nextLong();
System.out.println("[INST]6;K;stdIn.nextLong();"+K);
		long D = stdIn.nextLong();
System.out.println("[INST]7;D;stdIn.nextLong();"+D);
		
		long ans = X;
		
		if(K <= X / D) {
			ans = X - D * K;
		}else {
			K -= X / D;
			if(X % D <= Math.abs(X % D - D)) {
System.out.println("[INST]15;None;Math.abs(X % D - D);"+Math.abs(X % D - D));
				if(K % 2 == 0) {
					ans = X % D;
				}else {
					ans = Math.abs(X % D - D);
System.out.println("[INST]19;ans;Math.abs(X % D - D);"+ans);
				}
			}else if(Math.abs(X % D - D) < X % D) {
System.out.println("[INST]21;None;Math.abs(X % D - D);"+Math.abs(X % D - D));
				K -= 1;
				if(K % 2 == 0) {
					ans = Math.abs(X % D - D);
System.out.println("[INST]24;ans;Math.abs(X % D - D);"+ans);
				}else {
					ans = X % D;
				}
			}
		}
		
		System.out.println(ans);
	}
}