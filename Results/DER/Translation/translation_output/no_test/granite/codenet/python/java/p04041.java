System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
# seishin.py
N, X, Y, Z = map(int, input().split())
m = 2**(X+Y+Z)
S = [0]*m

L = max(X, Y, Z)

ss = set()
tt = set()

Z0 = (1 << (Z-1))
Y0 = (1 << (Z+Y-1))
X0 = (1 << (X+Z+Y-1))

for i in range(m):
    if i & Z0 and i & Y0 and i & X0:
        ss.add(i)

MASK = 2**(X+Y+Z)-1
MOD = 10**9 + 7

S[0] = 1
for i in range(N):
    T = [0]*m
    for s in range(m):
        if s in ss:
            # XYZãæç«
            continue
        b = (s << 1) | 1
        for k in range(1, L+1):
            t = (b << (k-1)) & MASK
            T[t] = (T[t] + S[s]) % MOD
        for k in range(L+1, 11):
            T[0] = (T[0] + S[s]) % MOD
    S = T
ans = 0
for s in range(m):
    if s in ss:
        continue
    ans = (ans + S[s]) % MOD
ans = (pow(10, N, MOD) + MOD - ans) % MOD
print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int m = 1 << (X + Y + Z);
        int[] S = new int[m];
        int L = Math.max(X, Math.max(Y, Z));
        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();
        int Z0 = 1 << (Z - 1);
        int Y0 = 1 << (Z + Y - 1);
        int X0 = 1 << (X + Z + Y - 1);
        for (int i = 0; i < m; i++) {
            if ((i & Z0)!= 0 && (i & Y0)!= 0 && (i & X0)!= 0) {
                ss.add(i);
            }
        }
        int MASK = (1 << (X + Y + Z)) - 1;
        int MOD = 100000007;
        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int s = 0; s < m; s++) {
                if (ss.contains(s)) {
                    continue;
                }
                int b = (s << 1) | 1;
                for (int k = 1; k <= L; k++) {
                    int t = (b << (k - 1)) & MASK;
                    T[t] = (T[t] + S[s]) % MOD;
                }
                for (int k = L + 1; k <= 10; k++) {
                    T[0] = (T[0] + S[s]) % MOD;
                }
            }
            S = T;
        }
        int ans = 0;
        for (int s = 0; s < m; s++) {
            if (ss.contains(s)) {
                continue;
            }
            ans = (ans + S[s]) % MOD;
        }
        ans = (int) ((long) Math.pow(10, N) % MOD - ans + MOD) % MOD;
        System.out.println(ans);
    }
}
```<|endoftext|>
