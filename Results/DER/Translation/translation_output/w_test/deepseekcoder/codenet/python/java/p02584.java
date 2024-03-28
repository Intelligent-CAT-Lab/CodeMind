<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int K = scanner.nextInt();
        int D = scanner.nextInt();

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

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the absolute value of the first integer, divides it by the third integer, and assigns the result to `count`. If `count` is greater than the second integer, it calculates the difference between the absolute value of the first integer and the product of the second integer and the third integer, and assigns this value to `ans`. If `count` is not greater than the second integer, it checks if the difference between `count` and the second integer is even. If it is, it calculates the remainder of the absolute value of the first integer divided by the third integer, and assigns this value to `ans`. If the difference between `count` and the second integer is not even, it calculates the difference between the remainder of the absolute value of the first integer divided by the third integer and the third integer, and assigns this value to `ans`. Finally, it prints the value of `ans`.
<|EOT|>
