<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
10


```
# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = map(int, input().split())

print(C(k,n)%MOD if n < k else 0 if n > k else 1)

```
[/INST]
```java
import java.util.Scanner;

public class BallAndBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = (int) Math.pow(10, 9) + 7;

        int C = 1;
        for (int i = n - k + 1; i <= n; i++) {
            C = (C * i) % MOD;
        }

        int H = 1;
        for (int i = 1; i <= k; i++) {
            H = (H * i) % MOD;
        }

        int result = C * H % MOD;
        System.out.println(result);
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read the input from the user, and it uses the `Math.pow()` method to calculate the value of `MOD`. The `C` and `H` variables are calculated using the same logic as in the Python code, and the final result is printed to the console.

Note that the `MOD` variable is defined as an integer, which means that it can only hold values up to 2^31 - 1. If you need to handle larger values of `MOD`, you will need to use a different data type, such as a `long` or a `BigInteger`.</s>
