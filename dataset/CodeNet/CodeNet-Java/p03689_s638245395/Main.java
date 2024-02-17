
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		new Main().run();
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int h = sc.nextInt();
		int w = sc.nextInt();
		if (H % h == 0 && W % w == 0) {
			System.out.println("No");
			return;
		} else {
			System.out.println("Yes");
		}
		int[][] a = new int[H][W];
		for (int i = 0; i < H; i += h) {
			for (int j = 0; j < W; j += w) {
				a[i][j] = 1_000_000_000 - 1;
				if (i + h - 1 < H && j + w - 1 < W) {
					a[i + h - 1][j + w - 1] = -1_000_000_000;
				}
			}
		}
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				System.out.print(a[i][j] + (j < W - 1 ? " " : "\n"));
			}
		}

	}

	void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
}
