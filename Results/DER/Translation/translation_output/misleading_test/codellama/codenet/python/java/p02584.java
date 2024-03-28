<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2 4

Expected output:
38

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

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int K = sc.nextInt();
        int D = sc.nextInt();

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
Explanation:

* The code first takes input from the user using the `Scanner` class.
* It then calculates the number of times the input `X` can be divided by `D` using the `Math.abs()` method.
* The `count` variable is then used to check if the number of times `X` can be divided by `D` is greater than `K`.
* If `count` is greater than `K`, then the code calculates the difference between `X` and `D` multiplied by `K`.
* If `count` is less than or equal to `K`, then the code checks if `(K - count) % 2 == 0`. If this condition is true, then the code calculates the remainder of `X` divided by `D`. If this condition is false, then the code calculates the difference between the remainder of `X` divided by `D` and `D`.
* Finally, the code prints the result to the console using the `System.out.println()` method.</s>
