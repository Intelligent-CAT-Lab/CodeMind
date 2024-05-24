import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}