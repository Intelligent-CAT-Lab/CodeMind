
import java.util.Scanner;

public class Main {
	
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		long [][][][]dp = new long [n+1][5][5][5];
		
		//左から現在の桁数、n-2,n-1,n,番目の文字がいくつか
		//0 -> null,1 -> A, 2 -> G,3 -> C, 4 -> T のようにした
		
		// 
		dp[0][0][0][0] = 1L;
		
		for(int i = 1 ; i <= n ;i++) {
			for(int j = 0 ; j < 5 ; j++) {
				for(int k = 0 ; k < 5 ; k++) {
					for(int l = 0 ; l < 5 ; l++) {
						for(int m = 1 ; m < 5 ; m++) {
							if(j == 1 && l == 2 && m == 3) {continue;}
							if(j == 1 && k == 2 && m == 3) {continue;}
							if(k == 1 && l == 2 && m == 3) {continue;}
							if(k == 1 && l == 3 && m == 2) {continue;}
							if(k == 2 && l == 1 && m == 3) {continue;}
							
							dp[i][k][l][m] = (dp[i][k][l][m] + dp[i-1][j][k][l])% mod;
						
						}
					}
				}
			}
		}
		
		
		long ans = 0;
		
		for(int i = 1 ; i < 5 ;i++) {
			for(int j = 1 ; j < 5 ; j++) {
				for(int k = 1 ; k < 5 ; k++) {
					ans = (ans + dp[n][i][j][k])%mod;
				}
			}
		}
	
		System.out.println(ans);
		
	}	
		
}
