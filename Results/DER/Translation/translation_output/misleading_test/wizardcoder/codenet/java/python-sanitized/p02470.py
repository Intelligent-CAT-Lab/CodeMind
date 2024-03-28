import java.io.*;
import java.util.*;

public class p02470 {

	private static Scanner sc;
	private static Printer pr;

	private static void solve() {
		int n = sc.nextInt();

		pr.println(Euler.totient((long)n));
	}

	static class Euler {
		private int[] phi;

		Euler(int n) {
			phi = new int[n];
			for (int i = 1; i <= n; i++) {
				phi[i - 1] = i;
			}

			for (int i = 2; i <= n; i++) {
				if (phi[i - 1] == i)