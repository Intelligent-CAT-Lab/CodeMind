import java.util.*;
import java.util.Map.Entry;

import java.io.*;

public class Main {
	static int[] a;
	static long[] memo;
	static long[] cum;

//	static long dp(int idx) {
//		if (idx == a.length)
//			return 0;
//		if (memo[idx] != -1)
//			return memo[idx];
//		long ans = Long.MAX_VALUE / 2;
//		if (idx != a.length - 1) {
//			ans = Math.min(a[idx] + a[idx + 1] + cum[idx + 2] + dp(idx + 2), cum[idx + 1] + dp(idx + 1));
//		} else {
//			ans = cum[idx + 1] + dp(idx + 1);
//		}
//		return memo[idx] = ans;
//	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);

		StringTokenizer st = new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		double ans=d*1.0/s;
		if(ans<=t)
			pw.println("Yes");
		else
			pw.println("No");

		pw.flush();
	}

	/*
	 * 4 6 2 3 4 4 5 7 5 5 15 40 30 10 10 3 1 5 4 8 2 6 1 1 2 9 3 2 1 6 5 2 6 4 3
	 * 
	 */
	static class SegmentTree { // 1-based DS, OOP

		int N; // the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree, lazy;

		SegmentTree(int[] in) {
			array = in;
			N = in.length - 1;
			sTree = new int[N << 1]; // no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = new int[N << 1];
			build(1, 1, N);
		}

		void build(int node, int b, int e) // O(n)
		{
			if (b == e)
				sTree[node] = array[b];
			else {
				int mid = b + e >> 1;
				build(node << 1, b, mid);
				build(node << 1 | 1, mid + 1, e);
				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
			}
		}

		void update_point(int index, int val) // O(log n)
		{
			index += N - 1;
			sTree[index] += val;
			while (index > 1) {
				index >>= 1;
				sTree[index] = sTree[index << 1] + sTree[index << 1 | 1];
			}
		}

		void update_range(int i, int j, int val) // O(log n)
		{
			update_range(1, 1, N, i, j, val);
		}

		void update_range(int node, int b, int e, int i, int j, int val) {
			if (i > e || j < b)
				return;
			if (b >= i && e <= j) {
				sTree[node] += (e - b + 1) * val;
				lazy[node] += val;
			} else {
				int mid = b + e >> 1;
				propagate(node, b, mid, e);
				update_range(node << 1, b, mid, i, j, val);
				update_range(node << 1 | 1, mid + 1, e, i, j, val);
				sTree[node] = sTree[node << 1] + sTree[node << 1 | 1];
			}

		}

		void propagate(int node, int b, int mid, int e) {
			lazy[node << 1] += lazy[node];
			lazy[node << 1 | 1] += lazy[node];
			sTree[node << 1] += (mid - b + 1) * lazy[node];
			sTree[node << 1 | 1] += (e - mid) * lazy[node];
			lazy[node] = 0;
		}

		int query(int i, int j) {
			return query(1, 1, N, i, j);
		}

		int query(int node, int b, int e, int i, int j) // O(log n)
		{
			if (i > e || j < b)
				return 0;
			if (b >= i && e <= j)
				return sTree[node];
			int mid = b + e >> 1;
			propagate(node, b, mid, e);
			int q1 = query(node << 1, b, mid, i, j);
			int q2 = query(node << 1 | 1, mid + 1, e, i, j);
			return q1 + q2;

		}

	}

	static long gcd(long a, long b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int countD(int x) {
		int c = 0;
		while (x != 0) {
			c += x % 10;
			x /= 10;
		}
		return c;
	}

	static ArrayList<Integer> intersect(ArrayList<Integer> a, ArrayList<Integer> b) {
		ArrayList<Integer> res = new ArrayList<>();
		if (b.size() != 0) {
			HashSet<Integer> hm = new HashSet<>();
			for (int x : a)
				hm.add(x);
			for (int x : b)
				if (hm.contains(x))
					res.add(x);
		}
		return res;
	}

	static class pair implements Comparable<pair> {
		int x;
		int y;

		public pair(int d, int u) {
			x = d;
			y = u;
		}

		@Override
		public int compareTo(pair o) {
			return x - o.x;
		}

	}

	static class pair2 implements Comparable<pair2> {
		int x;
		int y;

		public pair2(int d, int u) {
			x = d;
			y = u;
		}

		@Override
		public int compareTo(pair2 o) {
			// TODO Auto-generated method stub
			int x1 = y - x;
			int x2 = o.y - o.x;
			return x1 - x2;
		}

	}

}