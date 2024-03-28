import java.util.*;

public class p02337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int mod = 1000000007;
        int[][] star = new int[1001][1001];
        for(int i=0;i<=1000;i++){
            star[i][0] = 0;
            star[i][i] = 1;
            if(i>0)
                star[i][1] = 1;
        }
        for(int i=2;i<=1000;i++){
            for(int j=2;j<=i;j++){
                star[i][j] = (star[i-1][j-1] + j*star[i-1][j])%mod;
            }
        }
        int ans = 0;
        for(int i=0;i<=k;i++){
            ans = (ans + search(n, i, star))%mod;
        }
        System.out.println(ans);
    }
    public static int search(int n, int k, int[][] star){
        if(n<k)
            return 0;
        else
            return star[n][k];
    }
}