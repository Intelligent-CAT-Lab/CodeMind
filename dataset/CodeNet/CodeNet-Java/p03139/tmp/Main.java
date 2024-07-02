import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
System.out.println("[INST]7;N;sc.nextInt();"+N);
		int A = sc.nextInt();
System.out.println("[INST]8;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]9;B;sc.nextInt();"+B);
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}