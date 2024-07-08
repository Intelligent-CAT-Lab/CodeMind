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
		final int c = sc.nextInt();
	
		final int a1 = sc.nextInt();
		final int a2 = sc.nextInt();
		final int b1 = sc.nextInt();
		final int b2 = sc.nextInt();
		
		int b1_ = Math.abs(b1 - a1);
		int b2_ = Math.abs(b2 - a2);
		
		long pow = 1;
		if(b1_ == r - b1_){
			pow *= 2;
		}
		if(b2_ == c - b2_){
			pow *= 2;
		}
		
		b1_ = Math.min(b1_, r - b1_);
		b2_ = Math.min(b2_, c - b2_);
		
		
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