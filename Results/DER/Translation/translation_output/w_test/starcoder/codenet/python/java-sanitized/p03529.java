import java.util.*;
import java.io.*;

public class p03529 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int mod = 1000000007;
        int[] lis = new int[3300];
        lis[0] = 1;
        for(int i = N; i >= 1; i--){
            int[] nlis = new int[3300];
            for(int j = K+1; j >= 1; j--){
                for(int last = 0; last < 3300; last++){
                    if(i < j)
                        nlis[last] += lis[last];
                    else if((last+j)/i + last < 3300)
                        nlis[last + (last+j)/i] += lis[last];
                }
            }
            lis = nlis;
        }
        int ans = 0;
        for(int i = 0; i < 3300; i++)
            ans += lis[i] * i;
        ans = (ans % mod) * (K * (K+1) / 2 % mod) % mod;
        for(int i = 0; i <