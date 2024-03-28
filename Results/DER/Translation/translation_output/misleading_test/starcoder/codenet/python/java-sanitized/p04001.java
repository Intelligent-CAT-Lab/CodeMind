import java.util.*;
public class p04001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] sep = new int[n];
        sep[0] = 0;
        int[] dp = new int[n];
        dp[0] = 0;
        for(int i=1;i<n;i++){
            sep[i] = i;
            dp[i] = 0;
            for(int j=i;j>=0;j--){
                dp[i] += Integer.parseInt(String.valueOf(n).substring(j,i+1));
                sep[i] = j;
            }
        }
        System.out.println(dp[n-1]);
    }
}