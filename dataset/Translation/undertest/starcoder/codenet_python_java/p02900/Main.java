import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int gcd = gcd(A,B);
        int[] prime_factor = prime_factorize(gcd);
        int ans = prime_factor.length;
        for(int i=0;i<(1<<prime_factor.length);i++){
            int count = 0;
            int composite = 1;
            for(int j=0;j<prime_factor.length;j++){
                if((i&(1<<j))!=0){
                    composite *= prime_factor[j];
                    count++;
                }
            }
            if(count >= 2 && composite!= 1){
                ans--;
            }
        }
        System.out.println(ans+1);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static int[] prime_factorize(int n){
        int[] a = new int[100];
        int i = 0;
        while(n%2==0){
            a[i] = 2;
            n/=2;
        }
        int f = 3;
        while(f*f<=n){
            if(n%f==0){
                a[i] = f;
                n/=f;
            }
            else{
                f+=2;
            }
        }
        if(n!=1){
            a[i] = n;
        }
        return a;
    }
}