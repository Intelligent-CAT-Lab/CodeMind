import java.util.*;
public class p02960 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int mod = (int)1e9+7;
        int[][] dp = new int[l+1][13];
        dp[0][0] = 1;
        for(int i=0;i<l;i++){
            for(int j=0;j<13;j++){
                if(s.charAt(i)=='?'){
                    for(int k=0;k<10;k++){
                        dp[i+1][(j*10+k)%13] += dp[i][j];
                        dp[i+1][(j*10+k)%13]%=mod;
                    }
                }else{
                    dp[i+1][(j*10+s.charAt(i)-'0')%13] += dp[i][j];
                    dp[i+1][(j*10+s.charAt(i)-'0')%13]%=mod;
                }
            }
        }
        System.out.println(dp[l][5]);
    }
}