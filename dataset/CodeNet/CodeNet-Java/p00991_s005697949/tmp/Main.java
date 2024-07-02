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
System.out.println("[INST]18;r;sc.nextInt();"+r);
		int c = sc.nextInt();
System.out.println("[INST]19;c;sc.nextInt();"+c);
		int a1 = sc.nextInt();
System.out.println("[INST]20;a1;sc.nextInt();"+a1);
		int a2 = sc.nextInt();
System.out.println("[INST]21;a2;sc.nextInt();"+a2);
		int b1 = sc.nextInt();
System.out.println("[INST]22;b1;sc.nextInt();"+b1);
		int b2 = sc.nextInt();
System.out.println("[INST]23;b2;sc.nextInt();"+b2);
		int[][] dp = new int[r][c];
		int[][] cost = new int[r][c];
		boolean[][] use = new boolean[r][c];
		dp[a1][a2] = 1;
		for(int i = 0; i < r; i++) {
			Arrays.fill(cost[i], 2 << 27);
System.out.println("[INST]29;None;Arrays.fill(cost[i], 2 << 27);"+Arrays.fill(cost[i], 2 << 27));
		}
		ArrayDeque<Data> queue = new ArrayDeque<Data>();
		queue.add(new Data(a1,a2,0));
System.out.println("[INST]32;None;queue.add(new Data(a1,a2,0));"+queue.add(new Data(a1,a2,0)));
		while(!queue.isEmpty()) {
System.out.println("[INST]33;None;queue.isEmpty();"+queue.isEmpty());
			Data tmp = queue.poll();
System.out.println("[INST]34;tmp;queue.poll();"+tmp);
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
System.out.println("[INST]56;None;queue.add(new Data(ty,tx,tmp.c+1));"+queue.add(new Data(ty,tx,tmp.c+1)));
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