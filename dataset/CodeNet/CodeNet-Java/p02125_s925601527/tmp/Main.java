import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		solve3027();
	}

	public static void solve3027() {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
System.out.println("[INST]10;N;sc.nextInt();"+N);
		int binaryNumDigits = Integer.toBinaryString(N).length();
System.out.println("[INST]11;binaryNumDigits;Integer.toBinaryString(N).length();"+binaryNumDigits);
System.out.println("[INST]11;None;Integer.toBinaryString(N);"+Integer.toBinaryString(N));

		int ans = N == Math.pow(2, binaryNumDigits) - 1 ? binaryNumDigits : binaryNumDigits - 1;
System.out.println("[INST]13;None;Math.pow(2, binaryNumDigits);"+Math.pow(2, binaryNumDigits));
		System.out.println(ans);

		sc.close();
	}
}

