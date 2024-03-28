
```
import java.util.*;

class p03529:
    def powerMod(x, exponent):
        prod = 1
        for i in range(63, -1, -1):
            prod = (prod * prod) % MOD
            if ((exponent & 1L << i) != 0):
                prod = (prod * x) % MOD
        return prod

    def f(n, k):
        t = 0
        for i in range(n, 0, -1):
            t += (t + i) / i
        return t

    MOD = 1000000007

    def main():
        scan = Scanner(System.in)
        n = scan.nextInt()
        k = scan.nextInt()
        x = 0
        l = f(n, k)
        dp = [[0 for i in range(l + 1)] for j in range(n + 1)]
        for i in range(1, n + 1):
            m = powerMod(k + 1, i - 1)
            for u in range(0, l + 1):
                t = 0
                for j in range(0, min(i, k) + 1):
                    if u + (u + j) / i <= l:
                        t += dp[i - 1][u + (u + j) / i]
                        t += ((u + j) % i) * m % MOD
                        t %= MOD
                for j in range(min(i, k) + 1, k + 1):
                    t = (t + dp[i - 1][u] + (j + u) * m) % MOD
                dp[i][u] = t
        print(dp[n][0])

    if __name__ == '__main__':
        main()
```

## 03530

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03530 {
    static int f(int n, int k) {
        int t=0;
        for(int i=n;i>=1;--i){
            t+=(t+i)/i;
        }
        return t;
    }
    static final long MOD=1000000007;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int x=0;
        int l=f(n,k);
        long[][]dp=new long[n+1][l+1];
        for(int i=1;i<=n;++i){
            long m=1;
            for(int j=0;j<i-1;++j)
                m=(m*k)%MOD;
            for(int u=0;u<=l;++u){
                long t=0;
                for(int j=0;j<=Math.min(i,k);++j)
                    if(u+(u+j)/i<=l){
                        t+=dp[i-1][u+(u+j)/i];
                        t+=((u+j)%i)*m%MOD;
                        t%=MOD;
                    }
                for(int j=Math.min(i,k)+1;j<=k;++j)
                    t=(t+dp[i-1][u]+(j+u)*m)%MOD;
                dp[i][u]=t;
            }
        }
        System.out.println(dp[n][0]);
    }
}

```

python code:
```
import java.util.*;

class p03530:
    def f(n, k):
        t = 0
        for i in range(n, 0, -1):
            t += (t + i) / i
        return t

    MOD = 1000000007

    def main():
        scan = Scanner(System.in)
        n = scan.nextInt()
        k = scan.nextInt()
        x = 0
        l = f(n, k)
        dp = [[0 for i in range(l + 1)] for j in range(n + 1)]
        for i in range(1, n + 1):
            m = 1
            for j in range(0, i - 1):
                m = (m * k) % MOD
            for u in range(0, l + 1):
                t = 0
                for j in range(0, min(i, k) + 1):
                    if u + (u + j) / i <= l:
                        t += dp[i - 1][u + (u + j) / i]
                        t += ((u + j) % i) * m % MOD
                        t %= MOD
                for j in range(min(i, k) + 1, k + 1):
                    t = (t + dp[i - 1][u] + (j + u) * m) % MOD
                dp[i][u] = t
        print(dp[n][0])

    if __name__ == '__main__':
        main()
```
 1000000007;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int x=0;
        int l=f(n,k);
        long[][]dp=new long[n+1][l+1];
        for(int i=1;i<=n;++i){
            long m=1;
            for(int j=0;j<i-1;++j)
                m=(m*k)%MOD;
            for(int u=0;u<=l;++u){
                long t=0;
                for(int j=0;j<=Math.min(i,k);++j)
                    if(u+(u+j)/i<=l){
                        t+=dp[i-1][u+(u+j)/i];
                        t+=((u+j)%i)*m%MOD;
                        t%=MOD;
                    }
                for(int j=Math.min(i,k)+1;j<=k;++j)
                    t=(t+dp[i-1][u]+(j+u)*m)%MOD;
                dp[i][u]=t;
            }
        }
        System.out.println(dp[n][0]);
    }
}

```

python code:
```
import java.util.*;

class p03530:
    def f(n, k):
        t = 0
        for i in range(n, 0, -1):
            t += (t + i) / i
        return t

    MOD = 1000000007

    def main():
        scan = Scanner(System.in)
        n = scan.nextInt()
        k = scan.nextInt()
        x = 0
        l = f(n, k)
        dp = [[0
