import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Main {
	public static void main(String[] args) {
		new Main().solve();
	}

	void solve() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]16;n;sc.nextInt();"+n);
		int d = sc.nextInt();
System.out.println("[INST]17;d;sc.nextInt();"+d);
		int x = sc.nextInt();
System.out.println("[INST]18;x;sc.nextInt();"+x);
		double[] F = new double[200001];
		double[] G = new double[200001];
		{
			Arrays.fill(F, -1);
System.out.println("[INST]22;None;Arrays.fill(F, -1);"+Arrays.fill(F, -1));
			Arrays.fill(G, -1);
System.out.println("[INST]23;None;Arrays.fill(G, -1);"+Arrays.fill(G, -1));
		}
		F[1] = 0.5;
		G[1] = 1;
		for (int i = 2; i <= 200000; ++i) {
			F[i] = (1 + 2. / i) * F[i - 1] + 5. / (2 * i) * G[i - 1] + 1. / (2 * i) * i * (2 * i - 1);
			G[i] = (1 + 1. / i) * G[i - 1] + 1;
		}
		System.out.println(String.format("%.20f", F[n] * x + d * G[n]));
	}

	public static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
