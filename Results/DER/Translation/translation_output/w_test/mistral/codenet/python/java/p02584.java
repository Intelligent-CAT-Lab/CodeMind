<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2 4

Expected output:
2


```
X,K,D = map(int,input().split())
# åç¹ã«è¿ãä½ç½®ã¾ã§ã®ç§»ååæ°ãæ±ãã
count = abs(X) // D
ans = 0
# Kã®æ¹ãå°ãããã°å¯è½ãªéãåç¹ã«è¿ãä½ç½®ãæ±ãã
if count>K:
    ans = abs(X) - D * K
else:
	# æ®ãã®ç§»ååæ°ãå¶æ°
    if (K-count)%2==0:
        ans = abs(X) % D
    # æ®ãã®ç§»ååæ°ãå¥æ°
    else:
        ans = abs(abs(X) % D - D)
print(ans)

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, K, D;
        X = sc.nextInt();
        K = sc.nextInt();
        D = sc.nextInt();
        int count = Math.abs(X) / D;
        int ans = 0;
        // K's direction is down, so it's possible to get X back to the origin by subtracting D * K
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            // If (K-count)%2==0, then X is even and can be divided by D
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            } else {
                // If (K-count)%2!=0, then X is odd and can be divided by D-1
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}
```</s>
