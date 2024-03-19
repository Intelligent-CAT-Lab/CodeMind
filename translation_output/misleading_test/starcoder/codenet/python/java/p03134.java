<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
02

Expected output:
43

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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] lis = new int[2*N+1];
        lis[0] = 1;
        int R = 0, B = 0;
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            if (s.equals("0")) {
                R += 2;
            } else if (s.equals("1")) {
                R += 1;
                B += 1;
            } else {
                B += 2;
            }
            int[] nlis = new int[2*N+1];
            for (int j = 0; j < 2*N; j++) {
                if (j < R) {
                    nlis[j+1] += lis[j];
                    nlis[j+1] %= 998244353;
                }
                if (j-i < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= 998244353;
                }
            }
            lis = nlis;
        }
        for (int i = 0; i < N; i++) {
            int[] nlis = new int[2*N+1];
            for (int j = 0; j < 2*N; j++) {
                if (j < R) {
                    nlis[j+1] += lis[j];
                    nlis[j+1] %= 998244353;
                }
                if (j-i < B) {
                    nlis[j] += lis[j];
                    nlis[j] %= 998244353;
                }
            }
            lis = nlis;
        }
        System.out.println(Arrays.stream(lis).sum() % 998244353);
    }
}
```
<|endoftext|>
