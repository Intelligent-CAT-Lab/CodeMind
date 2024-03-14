import java.util.*;
public class p01593 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        double[] dp=new double[1001];
        dp[0]=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=m;j++){
                if(i+j<=n)dp[i+j]+=dp[i]/(n-i);
            }
        }
        System.out.printf("%.10f",dp[n]);
    }
}