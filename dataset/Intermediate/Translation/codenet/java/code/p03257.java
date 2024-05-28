

import java.util.Scanner;

public class p03257 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n==2) {
			System.out.println("4 7");
			System.out.println("23 10");
			return;
		}
		
		int snt[] = new int[n * 2];

		int cn = 0;
		int x = 2;
		while (cn < n * 2) {
			if (isSNT(x)) {
				snt[cn] = x;
				cn++;
			}
			x++;
		}

		long[][] a = new long[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = i % 2; j < n; j += 2) {
				int a1 = (i + j) / 2;
				int a2 = (j - i + n - 1) / 2 + n;
				a[i][j] = snt[a1] * snt[a2];
			}
		}



		int dx[] = { -1, 0, 1, 0 };
		int dy[] = { 0, 1, 0, -1 };
		for (int i = 0; i < n; i++) {
			for (int j = (i + 1) % 2; j < n; j += 2) {
				long gcd = 0;
				long tich = 1;
				for (int k = 0; k < 4; k++) {
					if (i + dx[k] < 0 || i + dx[k] >= n)
						continue;
					if (j + dy[k] < 0 || j + dy[k] >= n)
						continue;
					if (gcd == 0) {
						gcd = a[i + dx[k]][j + dy[k]];
						tich = gcd;
					} else {
						gcd = gcd(tich, a[i + dx[k]][j + dy[k]]);
						tich = tich / gcd * a[i + dx[k]][j + dy[k]];
					}
				}
				a[i][j] = tich+1;

			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static boolean isSNT(int x) {
		for (int i = 2; i * i <= x; i++)
			if (x % i == 0)
				return false;
		return true;
	}

	private static long gcd(long a, long b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}
