<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 7 5

Expected output:
12

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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int m = (int) Math.pow(2, X + Y + Z);
        int[] S = new int[m];

        int L = Math.max(X, Y, Z);

        Set<Integer> ss = new HashSet<>();
        Set<Integer> tt = new HashSet<>();

        int Z0 = (1 << (Z - 1));
        int Y0 = (1 << (Z + Y - 1));
        int X0 = (1 << (X + Z + Y - 1));

        for (int i = 0; i < m; i++) {
            if ((i & Z0) && (i & Y0) && (i & X0)) {
                ss.add(i);
            }
        }

        int MASK = (int) Math.pow(2, X + Y + Z) - 1;
        int MOD = (int) 1e9 + 7;

        S[0] = 1;
        for (int i = 0; i < N; i++) {
            int[] T = new int[m];
            for (int j = 0; j < m; j++) {
                if (j == ss.size()) {
                    continue;
                }
                int b = (j << 1) | 1;
                for (int k = 1; k <= L; k++) {
                    int t = (b << (k - 1)) & MASK;
                    T[t] = (T[t] + S[j]) % MOD;
                }
                for (int k = L + 1; k <= 10; k++) {
                    T[0] = (T[0] + S[j]) % MOD;
                }
            }
            S = T;
        }

        int ans = 0;
        for (int j = 0; j < m; j++) {
            if (j == ss.size()) {
                continue;
            }
            ans = (ans + S[j]) % MOD;
        }

        ans = (ans + Math.pow(10, N, MOD) - 1) % MOD;
        System.out.println(ans);
    }
}
```</s>
