import java.util.*;
import java.io.*;

public class p03097 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] res = new int[n];
		int[] a_bits = new int[17];
		int[] b_bits = new int[17];
		for (int i = 0; i < 17; i++) {
			a_bits[i] = (a >> i) & 1;
			b_bits[i] = (b >> i) & 1;
		}
		int diff = 0;
		for (int i = 0; i < 17; i++) {
			if (a_bits[i]!= b_bits[i]) {
				diff = i;
				break;
			}
		}
		int s = (a % (1 << diff)) + (((a >> (diff + 1)) * (1 << (diff + 1))) >> 1);
		int t = (b % (1 << diff)) + (((b >> (diff + 1)) * (1 << (diff + 1))) >> 1);
		int u = s ^ 1;
		int[] left = f(n - 1, s, u);
		int[] right = f(n - 1, u, t);
		int x_bit = (a >> diff) & 1;
		int y_bit = (b >> diff) & 1;
		for (int i = 0; i < n; i++) {
			res[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] >> diff) * (1 << diff)) << 1);
			res[i] = (res[i] % (1 << diff)) + (1 << diff) * y_bit + (((res[i] >> diff) * (1 << diff)) << 1);
		}
		System.out.println("YES");
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static int[] f(int n, int s, int t) {
		if (n == 1) {
			if (s == 0) {
				return new int[] { 0, 1 };
			} else {
				return new int[] { 1, 0 };
			}
		}
		int[] res = new int[n];
		int diff = 0;
		for (int i = 0; i < 17; i++) {
			if ((s >> i) & 1!= (t >> i) & 1) {
				diff = i;
				break;
			}
		}
		int u = s ^ 1;
		int[] left = f(n - 1, s, u);
		int[] right = f(n - 1, u, t);
		int x_bit = (s >> diff) & 1;
		int y_bit = (t >> diff) & 1;
		for (int i = 0; i < n; i++) {
			res[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] >> diff) * (1 << diff)) << 1);
			res[i] = (res[i] % (1 << diff)) + (1 << diff) * y_bit + (((res[i] >> diff) * (1 << diff)) << 1);
		}
		return res;
	}
}