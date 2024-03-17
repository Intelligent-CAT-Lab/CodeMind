<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
10


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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, K;
        N = sc.nextInt();
        K = sc.nextInt();
        int mod = (int) 1e9 + 7;
        int[] lis = new int[3300];
        Arrays.fill(lis, 0);
        lis[0] = 1;

        for (int i = N; i >= 0; i--) {
            int[] nlis = new int[3300];
            Arrays.fill(nlis, 0);

            for (int j = 1; j <= K; j++) {
                for (int last = 0; last < 3300; last++) {
                    if (i < j) {
                        nlis[last] += lis[last];
                        nlis[last] %= mod;
                    } else if ((last + j) / i + last < 3300) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= mod;
                    }
                }
            }

            lis = nlis;
            // System.out.println(Arrays.toString(lis));

            int ans = K * (K + 1) / 2 * (int) Math.pow(K + 1, N - 1, mod) * N;
            // System.out.println(ans);

            for (int i = 0; i < 3300; i++) {
                ans -= lis[i] * i;
                ans %= mod;
            }
            System.out.println(ans);
        }
    }
}
```</s>
