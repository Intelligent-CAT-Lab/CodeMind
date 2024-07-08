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
var newVariable_0 = sc.next();				s[i] = newVariable_0;
			}
			ArrayList<String> list = new ArrayList<String>();
			for(int i = 0; i < n; i++){
				boolean flg = false;
				for(int j = 0; j < n; j++){
					if(i == j) continue;
var newVariable_1 = s[j].matches(".*" + s[i] + ".*");					if(newVariable_1){
						flg = true;
					}
				}
				if(! flg){
var newVariable_2 = list.add(s[i]);				}
			}
			
			n = list.size();
			int [][] pass = new int[n][n];
			for(int i = 0; i <n; i++){
				for(int j = 0; j < n; j++){
					if(i == j) continue;
var newVariable_3 = list.get(j);					int len = newVariable_3.length();
					for(int k = len; k >=0 ; k--){
var newVariable_4 = list.get(j);						String str = newVariable_4.substring(0,k);
var newVariable_5 = list.get(i).endsWith(str);var newVariable_6 = list.get(i);						if(newVariable_6.endsWith(str)){
							pass[i][j] = len - k;
							break;
						}
					}
					
				}
			}
			
			int [][] dp = new int[n][1 << n];
			for(int i = 0; i < n; i++){
				Arrays.fill(dp[i], INF);
var newVariable_7 = list.get(i).length();var newVariable_8 = list.get(i);				dp[i][1 << i] = newVariable_8.length();
			}
			
			for(int i = 0; i < (1 << n); i++){
				for(int j = 0; j < n; j++){
					if(dp[j][i] == INF) continue;
					for(int k = 0; k < n; k++){
						if((i & (1 << k)) > 0) continue;
						int next = i | (1 << k);
						int value = dp[j][i] + pass[j][k];
var newVariable_9 = Math.min(dp[k][next], value);						dp[k][next] = newVariable_9;
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