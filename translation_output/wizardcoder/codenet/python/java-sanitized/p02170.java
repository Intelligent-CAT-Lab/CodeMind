import java.util.*;
import java.io.*;

public class p02170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a = sc.nextInt();
        int mod = 998244353;
        int inv = pow(n, mod-2, mod);
        long A = (long)a * pow(100*n, mod-2, mod);
        long[] lst = new long[k+1];
        lst[k] = 1;
        for(int i=k-1;i>=0;i--){
            if(k > i + n){
                lst[i] = (A*(lst[i+1] - lst[i+n+1]) + lst[i+1]) % mod;
            }else{
                lst[i] = (A*(lst[i+1] - lst[k]) + (n-(k-i)+1)*inv + lst[i+1]) % mod;
            }
        }
        System.out.println((lst[0] - lst[1])%mod);
    }

    public static int pow(int a, int b, int mod){
        int res = 1;
        while(b > 0){
            if((b&1) == 1) res = (res*a) % mod;
            a = (a*a) % mod;
            b >>= 1;
        }
        return res;
    }
}