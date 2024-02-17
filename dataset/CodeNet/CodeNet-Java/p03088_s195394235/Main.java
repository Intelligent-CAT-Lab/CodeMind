import static java.lang.System.*;
import java.util.*;

public class Main {
	public static final int MOD = 1000000007;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);

        int n = sc.nextInt();
		
		long[][][][] dp = new long[4][4][4][n-3+1];
		for(int i=0; i<4; i++) 
			for(int j=0; j<4; j++) 
				for(int k=0; k<4; k++) {
					Arrays.fill(dp[i][j][k], 0L);
					dp[i][j][k][0] = 1L;
				}
		dp[0][1][2][0] = 0L;
		dp[0][2][1][0] = 0L;
		dp[1][0][2][0] = 0L;
		
		for(int m=0; m<n-3; m++) 
			for(int i=0; i<4; i++) 
				for(int j=0; j<4; j++) 
					for(int k=0; k<4; k++)
						for(int l=0; l<4; l++) {
							dp[j][k][l][m+1] += dp[i][j][k][m];
							dp[j][k][l][m+1] %= MOD;
							
							dp[0][1][2][m+1] = 0L;
							dp[0][2][1][m+1] = 0L;
							dp[1][0][2][m+1] = 0L;
							if(i==0) {
								for(int o=0; o<4; o++) {
									dp[o][1][2][m+1] = 0L;
									dp[1][o][2][m+1] = 0L;
								}
							}
						}
		
		long sum = 0L;
		for(int i=0; i<4; i++) 
			for(int j=0; j<4; j++) 
				for(int k=0; k<4; k++) {
					sum += dp[i][j][k][n-3];
					sum %= MOD;
				}
		
		out.println(sum);
	}
}