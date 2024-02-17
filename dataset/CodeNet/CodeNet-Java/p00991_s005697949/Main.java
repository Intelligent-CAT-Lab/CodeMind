import java.util.*;

import javax.xml.crypto.Data;

import java.math.*;
import java.awt.geom.*;
import java.io.*;
     
     
public class Main {
	static int W;
	static int H;
	static int N;
	static boolean[][] fld;
	static int[] vx = new int[] {0,1,0,-1};
	static int[] vy = new int[] {1,0,-1,0};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int[][] dp = new int[r][c];
		int[][] cost = new int[r][c];
		boolean[][] use = new boolean[r][c];
		dp[a1][a2] = 1;
		for(int i = 0; i < r; i++) {
			Arrays.fill(cost[i], 2 << 27);
		}
		ArrayDeque<Data> queue = new ArrayDeque<Data>();
		queue.add(new Data(a1,a2,0));
		while(!queue.isEmpty()) {
			Data tmp = queue.poll();
			if(use[tmp.a][tmp.b]) continue;
			use[tmp.a][tmp.b] = true;
			for(int i = 0; i < 4; i++) {
				int ty = tmp.a + vy[i];
				int tx = tmp.b + vx[i];
				if(tx == -1) {
					tx = c-1;
				}
				else if(tx == c) {
					tx = 0;
				}
				if(ty == -1) {
					ty = r-1;
				}
				else if(ty == r) {
					ty = 0;
				}
				if(cost[ty][tx] < tmp.c+1 || use[ty][tx]) continue;
				cost[ty][tx] = tmp.c+1;
				dp[ty][tx] += dp[tmp.a][tmp.b];
				dp[ty][tx] %= 100000007;
				queue.add(new Data(ty,tx,tmp.c+1));
			}
		}
		System.out.println(dp[b1][b2]);
	}
	static class Data{
		int a;
		int b;
		int c;
		Data(int c, int d, int e) {
			a = c;
			b = d;
			this.c = e;
		}
	}
}