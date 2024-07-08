import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
var newVariable_0 = stdIn.nextLong();		long X = Math.abs(newVariable_0);
		long K = stdIn.nextLong();
		long D = stdIn.nextLong();
		
		long ans = X;
		
		if(K <= X / D) {
			ans = X - D * K;
		}else {
			K -= X / D;
var newVariable_1 = Math.abs(X % D - D);			if(X % D <= newVariable_1) {
				if(K % 2 == 0) {
					ans = X % D;
				}else {
					ans = Math.abs(X % D - D);
				}
var newVariable_2 = Math.abs(X % D - D);			}else if(newVariable_2 < X % D) {
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