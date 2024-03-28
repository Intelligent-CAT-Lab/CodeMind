<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
"""

iåç®ã§ã¯åããiäººç®ã®æã£ã¦ããä»»æã®ãã¼ã«ãç½®ãã
èµ¤ãä½åæ¡ç¨ãããã§DP


"""

S = input()
N = len(S)
mod = 998244353

lis = [0] * (2*N+1)
lis[0] = 1
R = 0
B = 0

c = 0
for n in S:

    if n == "0":
        R += 2
    elif n == "1":
        R += 1
        B += 1
    else:
        B += 2

    nlis = [0] * (2*N+1)
    
    for i in range(2*N):

        if i < R:
            nlis[i+1] += lis[i]
            nlis[i+1] %= mod

        if c-i < B:
            nlis[i] += lis[i]
            nlis[i] %= mod

    lis = nlis
    c += 1


for loop in range(N):
    
    nlis = [0] * (2*N+1)
    
    for i in range(2*N):

        if i < R:
            nlis[i+1] += lis[i]
            nlis[i+1] %= mod

        if c-i < B:
            nlis[i] += lis[i]
            nlis[i] %= mod

    lis = nlis
    c += 1

print (sum(lis) % mod)
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        long mod = 998244353;

        int[] lis = new int[2 * N + 1];
        Arrays.fill(lis, 0);
        lis[0] = 1;
        int R = 0;
        int B = 0;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                R += 2;
            } else if (S.charAt(i) == '1') {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }
        }

        int[] nlis = new int[2 * N + 1];
        Arrays.fill(nlis, 0);

        for (int i = 0; i < 2 * N; i++) {
            if (i < R) {
                nlis[i + 1] += lis[i];
                nlis[i + 1] %= mod;
            }
            if (i < B) {
                nlis[i] += lis[i];
                nlis[i] %= mod;
            }
        }

        for (int i = 0; i < N; i++) {
            Arrays.fill(nlis, 0);

            for (int j = 0; j < 2 * N; j++) {
                if (j < R) {
                    nlis[j + 1] += lis[j];
                    nlis[j + 1] %= mod;
                }
                if (i - j < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= mod;
                }
            }

            for (int j = 0; j < 2 * N; j++) {
                lis[j] = nlis[j];
            }
            i++;
        }

        long result = 0;
        for (int i = 0; i < 2 * N; i++) {
            result += lis[i];
            result %= mod;
        }

        System.out.println(result);
    }
}
```</s>
