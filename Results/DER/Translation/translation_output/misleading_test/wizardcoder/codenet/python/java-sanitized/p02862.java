import java.util.*;

public class p02862 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = (x+y)/3;
        x -= n;
        y -= n;
        int MOD = 1000000007;
        int[] fact = new int[n+1];
        fact[0] = 1;
        for(int i=1;i<=n;i++){
            fact[i] = (fact[i-1]*i)%MOD;
        }
        int factX = fact[x];
        int factY = fact[y];
        int factN = fact[n];
        int c = (factN * modinv(factX, MOD) * modinv(factY, MOD))%MOD;
        System.out.println(c);
    }
    public static int modinv(int a, int m){
        int g = gcd(a, m);
        if(g!= 1){
            throw new RuntimeException("modular inverse does not exist");
        }
        return mod(a, m, g);
    }
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    public static int mod(int a, int m, int g){
        int x = 0;
        int y = 1;
        while(g > 0){
            int q = m/g;
            int temp = x - q*y;
            x = y;
            y = temp;
            m = g;
            g = m%g;
        }
        return (a%m + m)%m;
    }
}