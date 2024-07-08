import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve3027();
	}

	public static void solve3027() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
var newVariable_0 = Integer.toBinaryString(N);		int binaryNumDigits = newVariable_0.length();

var newVariable_1 = Math.pow(2, binaryNumDigits);		int ans = N == newVariable_1 - 1 ? binaryNumDigits : binaryNumDigits - 1;
		System.out.println(ans);

		sc.close();
	}
}

