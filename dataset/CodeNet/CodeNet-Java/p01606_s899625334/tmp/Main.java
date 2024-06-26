import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
System.out.println("[INST]6;N;sc.nextInt();"+N);
		int W = sc.nextInt();
System.out.println("[INST]7;W;sc.nextInt();"+W);
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
System.out.println("[INST]24;None;sb.append(' ');"+sb.append(" "));
			sb.append(a[i]);
System.out.println("[INST]25;None;sb.append(a[i]);"+sb.append(a[i]));
		}
		System.out.println(sb);
	}
}