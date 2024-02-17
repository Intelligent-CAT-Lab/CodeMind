
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	int rec(int[] b, int left, int right) {
		if (right - left == 2) {
			if (b[left] == -1 && b[left + 1] == -1) {
				return -1;
			}
			if (b[left] == -1 || b[left + 1] == -1) {
				return 0;
			}
			return 1;
		}

		int mid = (left + right) / 2;

		int leftSum = rec(b, left, mid);
		int rightSum = rec(b, mid, right);

		if (leftSum == -1 && rightSum == -1) {
			return -1;
		}
		if (leftSum == -1 || rightSum == -1) {
			return leftSum + rightSum + 1;
		}
		return leftSum + rightSum + 1;
	}

	void run() {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int a[] = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}

		int b[] = new int[n];
		for (int i = 0; i < m; i++) {
			b[a[i]] = -1;
		}
		System.out.println(rec(b, 0, n));
	}
}

