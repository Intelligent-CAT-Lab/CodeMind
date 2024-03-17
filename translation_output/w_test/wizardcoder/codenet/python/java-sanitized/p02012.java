import java.util.*;

public class p02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] fact = new int[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++){
            fact[i] = (fact[i-1]*i)%1000000007;
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                if(i%j == 0){
                    cnt++;
                    if(j*j!= i){
                        cnt++;
                    }
                }
            }
            ans = (ans + cnt*fact[i])%1000000007;
        }
        System.out.println(ans);
    }
}