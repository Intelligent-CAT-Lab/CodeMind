import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int W = sc.nextInt();
		int[] a = new int[N * 2 + 1];
		a[1] += W / 2;
		for (int i = W / 2 + 1; i < W; ++i) {
			a[1]++;
			for (int j = i; j <= N; j += i) {
				if (j > i * 2) a[j - W + 1]++;
				a[j + 1]--;
			}
		}
		for (int i = W; i <= N; ++i) {
			a[i - W + 1]++;
			a[i + 1]--;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N - W + 1; ++i) {
			a[i] += a[i - 1];
			if (i != 1) sb.append(" ");
			sb.append(a[i]);
		}
		System.out.println(sb);
	}
}