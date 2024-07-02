import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);

		final int r = sc.nextInt();
System.out.println("[INST]12;r;sc.nextInt();"+r);
		final int c = sc.nextInt();
System.out.println("[INST]13;c;sc.nextInt();"+c);
	
		final int a1 = sc.nextInt();
System.out.println("[INST]15;a1;sc.nextInt();"+a1);
		final int a2 = sc.nextInt();
System.out.println("[INST]16;a2;sc.nextInt();"+a2);
		final int b1 = sc.nextInt();
System.out.println("[INST]17;b1;sc.nextInt();"+b1);
		final int b2 = sc.nextInt();
System.out.println("[INST]18;b2;sc.nextInt();"+b2);
		
		int b1_ = Math.abs(b1 - a1);
System.out.println("[INST]20;b1_;Math.abs(b1 - a1);"+b1_);
		int b2_ = Math.abs(b2 - a2);
System.out.println("[INST]21;b2_;Math.abs(b2 - a2);"+b2_);
		
		long pow = 1;
		if(b1_ == r - b1_){
			pow *= 2;
		}
		if(b2_ == c - b2_){
			pow *= 2;
		}
		
		b1_ = Math.min(b1_, r - b1_);
System.out.println("[INST]31;b1_;Math.min(b1_, r - b1_);"+b1_);
		b2_ = Math.min(b2_, c - b2_);
System.out.println("[INST]32;b2_;Math.min(b2_, c - b2_);"+b2_);
		
		
		long dp[][] = new long[r][c];
		
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				if(i == 0 && j == 0){
					dp[i][j] = 1;
				}else if(i == 0){
					dp[i][j] = dp[i][j-1];
				}else if(j == 0){
					dp[i][j] = dp[i-1][j];
				}else{
					dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % 100000007;
				}
			}
		}
		
		System.out.println((dp[b1_][b2_] * pow) % 100000007);
	}

}