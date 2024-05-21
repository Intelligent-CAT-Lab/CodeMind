import java.util.*;
import java.util.Map.Entry;

import java.io.*;

public class p02570 {
	static int[] a;
	static long[] memo;
	static long[] cum;

//	static long dp(int idx) {
//		if (idx == a.length)
//			return 0;
//		if (memo[idx]!= -1)
//			return memo[idx];
//		long ans = Long.MAX_VALUE / 2;
//		if (idx!= a.length - 1) {
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
		ans = d*1.0/s
		if ans <= t:
			print("Yes")
		else:
			print("No")

		pw.flush()
	}

	/*
	 * 4 6 2 3 4 4 5 7 5 5 15 40 30 10 10 3 1 5 4 8 2 6 1 1 2 9 3 2 1 6 5 2 6 4 3
	 * 
	 */
	static class SegmentTree { # 1-based DS, OOP

		int N; # the number of elements in the array as a power of 2 (i.e. after padding)
		int[] array, sTree, lazy;

		SegmentTree(int[] in) {
			array = in;
			N = in.length - 1;
			sTree = [0]*(N<<1); # no. of nodes = 2*N - 1, we add one to cross out index zero
			lazy = [0]*(N<<1);
			build(1,1,N)

		def build(self, node, b, e): # O(n)
			if b == e:
				sTree[node] = array[b]
			else:
				mid = b + e >> 1
				build(node<<1,b,mid)
				build(node<<1|1,mid+1,e)
				sTree[node] = sTree[node<<1] + sTree[node<<1|1]

		def update_point(self,index,val): # O(log n)
			index += N - 1
			sTree[index] += val
			while index>1:
				index >>= 1
				sTree[index] = sTree[index<<1] + sTree[index<<1|1]

		def update_range(self,i,j,val): # O(log n)
			update_range(1,1,N,i,j,val)

		def update_range(self,node,b,e,i,j,val):
			if i>e or j <b:
				return
			if b>= i and e <= j:
				sTree[node] += (e-b+1)*val
				lazy[node] += val
			else:
				mid = b + e >> 1
				propagate(node, b, mid, e)
				update_range(node<<1,b,mid,i,j,val)
				update_range(node<<1|1,mid+1,e,i,j,val)
				sTree[node] = sTree[node<<1] + sTree[node<<1|1]

		def propagate(self,node, b, mid, e):
			lazy[node<<1] += lazy[node]
			lazy[node<<1|1] += lazy[node]
			sTree[node<<1] += (mid - b + 1)*lazy[node]
			sTree[node<<1|1] += (e - mid)*lazy[node]
			lazy[node] = 0

		def query(self,i,j):
			return query(1,1,N,i,j)

		def query(self,node,b,e,i,j): # O(log n)
			if i>e or j <b:
				return 0
			if b>= i and e <= j:
				return sTree[node]
			mid = b + e >> 1
			propagate(node, b, mid, e)
			q1 = query(node<<1,b,mid,i,j)
			q2 = query(node<<1|1,mid+1,e,i,j)
			return q1 + q2

	def gcd(a,b):
		if a == 0:
			return b
		return gcd(b%a,a)

	def countD(x):
		c = 0
		while x!= 0:
			c += x%10
			x /= 10
		return c

	def intersect(a,b):
		res = []
		if b!= []:
			hm = set()
			for x in a:
				hm.add(x)
			for x in b:
				if x in hm:
					res.append(x)
		return res

	class pair(Comparable):
		def __init__(self,d,u):
			self.x = d
			self.y = u
		def __cmp__(self,o):
			return self.x - o.x

	class pair2(Comparable):
		def __init__(self,d,u):
			self.x = d
			self.y = u
		def __cmp__(self,o):
			# TODO Auto-generated method stub
			x1 = self.y - self.x
			x2 = o.y - o.x
			return x1 - x2