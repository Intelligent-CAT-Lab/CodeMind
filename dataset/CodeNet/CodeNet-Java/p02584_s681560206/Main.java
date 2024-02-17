import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		long X = Math.abs(stdIn.nextLong());
		long K = stdIn.nextLong();
		long D = stdIn.nextLong();
		
		long ans = X;
		
		if(K <= X / D) {
			ans = X - D * K;
		}else {
			K -= X / D;
			if(X % D <= Math.abs(X % D - D)) {
				if(K % 2 == 0) {
					ans = X % D;
				}else {
					ans = Math.abs(X % D - D);
				}
			}else if(Math.abs(X % D - D) < X % D) {
				K -= 1;
				if(K % 2 == 0) {
					ans = Math.abs(X % D - D);
				}else {
					ans = X % D;
				}
			}
		}
		
		System.out.println(ans);
	}
}