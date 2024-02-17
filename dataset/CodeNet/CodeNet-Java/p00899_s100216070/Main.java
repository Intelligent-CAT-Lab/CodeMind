import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main{
	int INF = 1 << 24;
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n == 0) break;
			String [] s = new String[n];
			for(int i = 0; i < n; i++){
				s[i] = sc.next();
			}
			ArrayList<String> list = new ArrayList<String>();
			for(int i = 0; i < n; i++){
				boolean flg = false;
				for(int j = 0; j < n; j++){
					if(i == j) continue;
					if(s[j].matches(".*" + s[i] + ".*")){
						flg = true;
					}
				}
				if(! flg){
					list.add(s[i]);
				}
			}
			
			n = list.size();
			int [][] pass = new int[n][n];
			for(int i = 0; i <n; i++){
				for(int j = 0; j < n; j++){
					if(i == j) continue;
					int len = list.get(j).length();
					for(int k = len; k >=0 ; k--){
						String str = list.get(j).substring(0,k);
						if(list.get(i).endsWith(str)){
							pass[i][j] = len - k;
							break;
						}
					}
					
				}
			}
			
			int [][] dp = new int[n][1 << n];
			for(int i = 0; i < n; i++){
				Arrays.fill(dp[i], INF);
				dp[i][1 << i] = list.get(i).length();
			}
			
			for(int i = 0; i < (1 << n); i++){
				for(int j = 0; j < n; j++){
					if(dp[j][i] == INF) continue;
					for(int k = 0; k < n; k++){
						if((i & (1 << k)) > 0) continue;
						int next = i | (1 << k);
						int value = dp[j][i] + pass[j][k];
						dp[k][next] = Math.min(dp[k][next], value);
					}
				}
			}
			int ans = INF;
			for(int i = 0; i < n; i++){
				ans = Math.min(ans, dp[i][(1 << n) - 1]);
			}
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().doit();
	}
}