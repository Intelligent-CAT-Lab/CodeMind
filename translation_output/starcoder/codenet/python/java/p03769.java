<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
fact = [1]
for i in range(1, 101):
    fact.append(fact[-1]*i)
    
def C(a, b):
    return fact[a]//(fact[b]*fact[a-b])

def sC(a, b):
    ret = 0
    for i in range(min(b, a-b) + 1):
        ret += C(b, i) * C(a - b, i)
    return ret

def calc(n, k):
    if n<=0:
        return []
    i = 0
    while (1<<(i+1)) -1 <= n:
        i += 1
        
    ret = [str(k)] * (i+1)
    rem = n-((1<<i) - 1)
    kk = k + 1
    i += 1
    j = i // 2
    
    while j > 0:
        while True:
            tmp = sC(i, j)
            if tmp <= rem:
                ret.insert(j, str(kk))
                ret.append(str(kk))
                kk += 1
                rem -= tmp

            else:
                break
                
        j -= 1
        
    return ret + calc(rem, kk)

N = int(input())

X = calc(N, 1)
print(len(X))
print(" ".join(X))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] fact = new int[101];
        fact[0] = 1;
        for (int i = 1; i <= 100; i++) {
            fact[i] = fact[i - 1] * i;
        }
        int[] dp = new int[101];
        for (int i = 1; i <= 100; i++) {
            dp[i] = i;
        }
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] += dp[j] * dp[i - j];
            }
        }
        int[] ans = new int[N + 1];
        int k = 1;
        for (int i = 1; i <= N; i++) {
            ans[i] = k;
            k += dp[i];
        }
        System.out.println(ans[N]);
        for (int i = 1; i <= N; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
```
<|endoftext|>
