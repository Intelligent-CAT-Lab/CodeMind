import java.util.*;
import java.lang.*;
import java.io.*;

public class p02900 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int gcd = gcd(A,B);
        int[] prime_factor = prime_factorize(gcd);
        int ans = prime_factor.length;
        for(int i = 0; i < (1<<prime_factor.length); i++){
            int composite = 1;
            int count = 0;
            for(int j = 0; j < prime_factor.length; j++){
                if((i & (1<<j))!= 0){
                    composite *= prime_factor[j];
                    count++;
                }
            }
            if(count >= 2 && composite!= 1){
                ans--;
            }
        }
        System.out.println(ans + 1);
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int[] prime_factorize(int n){
        int[] a = new int[100];
        int i = 0;
        while(n % 2 == 0){
            a[i] = 2;
            n /= 2;
            i++;
        }
        int f = 3;
        while(f * f <= n){
            if(n % f == 0){
                a[i] = f;
                n /= f;
                i++;
            }
            else{
                f += 2;
            }
        }
        if(n!= 1){
            a[i] = n;
            i++;
        }
        int[] ans = new int[i];
        for(int j = 0; j < i; j++){
            ans[j] = a[j];
        }
        return ans;
    }
}