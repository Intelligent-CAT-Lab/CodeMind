import java.util.*;
public class p03329 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] six = new int[7];
		int[] nine = new int[7];
		six[0] = 6;
		nine[0] = 9;
		for(int i = 1;i<7;i++){
			six[i] = six[i-1]*6;
			nine[i] = nine[i-1]*9;
		}
		int[] dp = new int[N+1];
		for(int i = 1;i<=N;i++){
			dp[i] = i;
			for(int j = 0;j<7;j++){
				if(six[j]<=i){
					dp[i] = Math.min(dp[i],dp[i-six[j]]+1);
				}
				if(nine[j]<=i){
					dp[i] = Math.min(dp[i],dp[i-nine[j]]+1);
				}
			}
		}
		System.out.println(dp[N]);
	}
}