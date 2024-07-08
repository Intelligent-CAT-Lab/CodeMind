import java.util.*;

public class Main {

  public static void main(String args[]) {
    (new Main()).solve();
  }

  void solve() {

    try (
      Scanner cin = new Scanner(System.in);
    ) {

    	int N = cin.nextInt();
    	int K = cin.nextInt();
    	int M = cin.nextInt();
    	
    	// used lesser integer * use current integer;
    	int transit[][] = new int[N + 1][N + 1];
    	transit[0][0] = 1;
    	for( int i = 0; i <= N; ++ i ) {
    		for( int j = 0; i + j <= N; ++j ) {
    			if( i > 0 ) {
    				transit[i][j] = (transit[i][j] + transit[i - 1][j]) % M;
    			}
    			if( j > 0 ) {
        			transit[i][j] = (int)((transit[i][j] + transit[i][j - 1] * (i + 1L)) % M);
    			}
    		}
    	}
    	
    	// used max integer * num used; 
    	long dp[][] = new long[K + 1][N + 1];
    	for( int i = 0; i <= N; ++i ) {
    		dp[1][i] = 1;
    	}
    	
    	for( int newVal = 2; newVal <= K; ++newVal ) {
    		for( int used = 0; used <= N; ++used ) {
    			for( int use = 0; use + used <= N; ++use ) {
    				dp[newVal][used + use] = (dp[newVal][used + use] + dp[newVal - 1][used] * transit[used][use]) % M;
    			}
    		}
    	}
    	
    	System.out.println(dp[K][N]);

    }
    
  }
  
}
