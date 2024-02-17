import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve3027();
	}

	public static void solve3027() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int binaryNumDigits = Integer.toBinaryString(N).length();

		int ans = N == Math.pow(2, binaryNumDigits) - 1 ? binaryNumDigits : binaryNumDigits - 1;
		System.out.println(ans);

		sc.close();
	}
}

