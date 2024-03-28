import java.util.*;
import java.math.*;

public class p03529 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int mod = (int) Math.pow(10,9) + 7;
        int[] lis = new int[3300];
        lis[0] = 1;
        for(int i=N;i>=1;i--){
            int[] nlis = new int[3300];
            for(int j=K+1;j>=1;j--){
                for(int last=0;last<3300;last++){
                    if(i<j)
                        nlis[last] = (nlis[last] + lis[last]) % mod;
                    else if((last+j)/i + last < 3300)
                        nlis[(last+j)/i + last] = (nlis[(last+j)/i + last] + lis[last]) % mod;
                }
            }
            lis = nlis;
        }
        int ans = K * (K+1) / 2 * pow(K+1,N-1,mod) * N