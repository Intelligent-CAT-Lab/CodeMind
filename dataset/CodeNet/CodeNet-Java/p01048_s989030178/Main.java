import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int count = 0;
		for (int i = 1;; ++i) {
			for (int j = 1; j <= i; ++j) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == N) {
				System.out.println(i);
				break;
			}
			count = 0;
		}
		sc.close();
	}
}

