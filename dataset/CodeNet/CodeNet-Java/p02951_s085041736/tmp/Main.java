import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);
		int C = sc.nextInt();
System.out.println("[INST]8;C;sc.nextInt();"+C);

		int ans = C - (A - B);
		System.out.println(ans > 0 ? ans : 0);

	}
}