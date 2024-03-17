<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int K = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        int count = Math.abs(X) / D;
        int ans = 0;

        if (count > K) {
            ans = Math.abs(X) - D * K;
        } else {
            if ((K - count) % 2 == 0) {
                ans = Math.abs(X) % D;
            } else {
                ans = Math.abs(Math.abs(X) % D - D);
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the count and ans as per the conditions in the Python code, and then prints the ans.<｜end▁of▁sentence｜>
