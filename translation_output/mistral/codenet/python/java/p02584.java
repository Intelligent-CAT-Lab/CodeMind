<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, K, D;
        X = scanner.nextInt();
        K = scanner.nextInt();
        D = scanner.nextInt();
        int count = Math.abs(X) / D;
        int ans = 0;
        // Kã®æ¹ãå°ãããã°å¯è½ãªéãåç¹ã«è¿ãä½ç½®ãæ±ãã
        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            // æ®ãã®ç§»ååæ°ãå¶æ°
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            }
            // æ®ãã®ç§»ååæ°ãå¥æ°
            else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}
```</s>
