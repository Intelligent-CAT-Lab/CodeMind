import java.util.*;
public class p03329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] six = {6, 36, 216, 1296, 7776, 46656, 279936};
        int[] nine = {9, 36, 216, 1296, 7776, 46656, 279936};
        int[][] dp = new int[N+1][2];
        dp[0][0] = 0;
        dp[0][1] = 0;
        for(int i=1;i<=N;i++){
            dp[i][0] = i;
            dp[i][1] = i;
            for(int j=0;j<7;j++){
                if(six[j]<=i){
                    dp[i][0] = Math.min(dp[i][0], dp[i-six[j]][0]+1);
                }
                if(nine[j]<=i){
                    dp[i][1] = Math.min(dp[i][1], dp[i-nine[j]][1]+1);
                }
            }
        }
        System.out.println(dp[N][0]);
    }
}