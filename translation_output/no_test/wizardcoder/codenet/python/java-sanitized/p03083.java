import java.util.*;

public class p03083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int B = sc.nextInt();
        int W = sc.nextInt();
        int mod = (int)1e9 + 7;
        int[] fact = new int[B+W+1];
        int[] invf = new int[B+W+1];
        int[] bina = new int[B+W+1];
        int[] invb = new int[B+W+1];
        fact[0] = 1;
        invf[0] = 1;
        bina[0] = 1;
        invb[0] = 1;
        for(int i=1;i<=B+W;i++){
            fact[i] = (fact[i-1] * i) % mod;
            invf[i] = (invf[i-1] * inved(fact[i-1])) % mod;
            bina[i] = (bina[i-1] * 2) % mod;
            invb[i] = (invb[i-1] * inved(bina[i-1])) % mod;
        }
        if(B == W){
            for(int i=0;i<B+W;i++){
                System.out.println(invf[2]);
            }
        }
        else if(B > W){
            for(int i=0;i<W;i++){
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for(int i=W+1;i<=B;i++){
                int F = (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for(int i=B+1;i<=B+W;i++){
                int F = invf[i-1-B] * invf[B-1];
                F %= mod;
                F *= fact[i-2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        }
        else{
            for(int i=0;i<B;i++){
                System.out.println(invf[2]);
            }
            int P = invf[2];
            for(int i=B+1;i<=W;i++){
                int F = (fact[i-2] * invf[i-1-B] * invf[B-1]) % mod;
                F *= mod - 1;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
            for(int i=W+1;i<=B+W;i++){
                int F = invf[i-1-B] * invf[B-1];
                F %= mod;
                F *= fact[i-2];
                F %= mod;
                F *= mod - 1;
                F += (fact[i-2] * invf[i-1-W] * invf[W-1]) % mod;
                F %= mod;
                F *= invb[i];
                F %= mod;
                F += P;
                F %= mod;
                System.out.println(F);
                P = F;
            }
        }
    }
    public static int inved(int a){
        int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while(l!= 0){
            int q = k / l;
            int t = x - u * q;
            x = u;
            u = t;
            t = y - v * q;
            y = v;
            v = t;
            k = l;
            l = k % l;
        }
        return x % mod;
    }
}