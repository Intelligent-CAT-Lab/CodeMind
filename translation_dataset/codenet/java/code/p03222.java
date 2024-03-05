import java.util.*;
public class p03222 {
	
	static int mod = (int)1e9+7;
	static int memo[] = new int[9];
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		makeMemo();
		
		long dp[][] = new long[H+1][W];
		dp[0][0]=1;
		for(int h=0;h<H;h++) {
			for(int w=0;w<W;w++) {
				//右
				if(w+1<W) {
					dp[h+1][w+1]+=dp[h][w]*memo[w]%mod*memo[(W-1)-(w+1)]%mod;
					dp[h+1][w+1]%=mod;
				}
				//左
				if(w-1>=0) {
					dp[h+1][w-1]+=dp[h][w]*memo[w-1]%mod*memo[(W-1)-w]%mod;
					dp[h+1][w-1]%=mod;
				}
				//下
				dp[h+1][w] += dp[h][w]*memo[w]%mod*memo[(W-1)-w]%mod;
				dp[h+1][w]%=mod;
				
			}
		}
		long ans = dp[H][K-1];
		System.out.println(ans);
	}
	//縦棒の数を引数にする
	static void makeMemo(){	
		memo[0]=1;
		memo[1]=1;
		for(int i=2;i<9;i++) {
			for(int bit = 0;bit<2<<(i-2);bit++) {
				int before = 0;
				for(int j=0;j<9;j++) {
					int now = (bit>>j&1);
					if(before==1&&now==1) break;
					before = now;
					if(j==8)memo[i]++;
				}
			}
		}
		
		
	}
}