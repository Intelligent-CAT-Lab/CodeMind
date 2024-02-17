import java.util.Scanner;

/**
 * B : ??????????????? / Lie with Mean Value
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line;

		//?????????: 0 - m

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] ns = new int[n];

		if (n > 2) {
			for (int i = n / 2 + 1; i < n; i++) {
				ns[i] = m;
			}
		}
		
		System.out.print(ns[0]);
		for (int i = 1; i < n; i++) {
			System.out.print(" " + ns[i]);
		}
		System.out.println();
	}
}