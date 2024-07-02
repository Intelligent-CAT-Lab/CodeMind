import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
System.out.println("[INST]6;X;sc.nextLong();"+X);
		long Y = sc.nextLong();
System.out.println("[INST]7;Y;sc.nextLong();"+Y);
		long A = X;
		int ans = 1;
		while (true) {
			if (A < 0) {
				A *= -2;
			} else {
				A *= 2;
			}
			if (A <= Y)
				ans++;
			else {
				System.out.println(ans);
				return;
			}
		}
	}

}
