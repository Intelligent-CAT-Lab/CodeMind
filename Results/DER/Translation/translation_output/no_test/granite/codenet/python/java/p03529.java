System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```

"""

https://atcoder.jp/contests/cf17-final/tasks/cf17_final_g

1åã®æä½ã§æ¨ã¦ãããç³ã¯1å
ããã¤æ¨ã¦ãããããèããæ¹ãããã ãã

å¤§ããæ¹ãã?âãããªãã¨ã¯ãªã
å°ããã»ããã?âãããªãã¨ã¯ãªã
ä»i=aiãæºããã¦ããä¸­ã§æå°ã®ãã®ããããã¹ãï¼âããã¯ãã

æ°ãä¸ããªã®ã§â¦ï¼ â Xåã¨ããç¤é¢ã¯ä½éãããã(1)
ã¾ãã¯ãããindexããå³ãXåé¸æã§ããindexããå³å´ã®æ°åã¯ä½éãã(2) â å·¦ã¯èªç±

(2)ã®æ¹ããããããã(Nã¯ã§ããã¨ãã)
â å³ç«¯ã¯1éã (Nã®ã¿)
â å³ãã2çªç®ã¯ 1åé¸æã N-1,A / 2åé¸æã N-2,N
â å³ãã3çªç®ã¯ 1åé¸æã N-2,(0åé¸æ)

å³ããé çªã«è¦ã¦ãï¼
100*100â10000åããåããªã
æ¯åä½ã®æ°å­ãå¨æ¢ç´¢ããã¨ãã¦ã 100^3ã§éã«åã
åããåæ°ã¯100log100

3300 * 100 * 100 = 3.3*10^7
éã«åããã
"""

N,K = map(int,input().split())
mod = 10**9+7
lis = [0] * 3300
lis[0] = 1

for i in range(N,0,-1):

    nlis = [0] * 3300
    
    for j in range(K+1):

        for last in range(3300):

            if i < j:
                nlis[last] += lis[last]
                nlis[last] %= mod
            elif (last+j)//i + last < 3300:
                nlis[last+(last+j)//i] += lis[last]
                nlis[last+(last+j)//i] %= mod
                

    lis = nlis
    #print (lis[:20])

ans = K * (K+1) // 2 * pow(K+1,N-1,mod) * N
#print (ans)

for i in range(3300):
    ans -= lis[i] * i
    ans %= mod
print (ans)

"""
#test

ans = 0
for i in range(100,0,-1):
    ans += (ans//i) + 1
print (ans)
"""
```


Answer:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static final int MOD = 1_000_000_007;
    static long[][][] dp;

    public static void main(String[] args) throws IOException {
        init();
        solution();
    }

    private static void solution() {
        dp = new long[N + 1][K + 1][2][3301];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l <= 3300; l++) {
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (K * (K + 1) / 2 % MOD) * pow(K + 1, N - i, MOD) % MOD * i % MOD;
            ans %= MOD;
        }
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= K; j++) {
                ans -= dfs(i, j, 0, 0) * i % MOD;
                ans %= MOD;
            }
        }
        System.out.println(ans);
    }

    private static long dfs(int n, int k, int b, int sum) {
        if (n == 0) {
            if (sum == 0) return 1;
            else return 0;
        }
        if (dp[n][k][b][sum]!= -1) return dp[n][k][b][sum];
        long ret = 0;
        if (b == 0) {
            for (int i = 0; i <= k; i++) {
                ret += dfs(n - 1, k, 1, sum + i);
                ret %= MOD;
            }
        } else {
            for (int i = 0; i <= k; i++) {
                ret += dfs(n - 1, k, 0, sum + i);
                ret %= MOD;
            }
        }
        return dp[n][k][b][sum] = ret;
    }

    private static long pow(long a, long b, long mod) {
        long ret = 1;
        a %= mod;
        while (b > 0) {
            if ((b & 1) == 1) {
                ret = ret * a % mod;
            }
            a = a * a % mod;
            b >>= 1;
        }
        return ret;
    }

    private static void init() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
    }
}
```<|endoftext|>
