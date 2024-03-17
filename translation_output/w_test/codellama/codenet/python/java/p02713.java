<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
9


```
from math import gcd
K = int(input())
ans = 0

for a in range(1, K+1):
    for b in range(1, K+1):
        for c in range(1, K+1):
            ans += gcd(gcd(a, b), c)

print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int ans = 0;

        for (int a = 1; a <= K; a++) {
            for (int b = 1; b <= K; b++) {
                for (int c = 1; c <= K; c++) {
                    ans += gcd(gcd(a, b), c);
                }
            }
        }

        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
This code uses the same logic as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `gcd` function to calculate the greatest common divisor of two numbers. The `gcd` function is defined in the code as well.

The `main` method first reads the input from the user and stores it in the `K` variable. It then initializes the `ans` variable to 0.

The code then enters a loop that iterates over all possible values of `a`, `b`, and `c` from 1 to `K`. For each combination of `a`, `b`, and `c`, it calculates the greatest common divisor of `a` and `b` using the `gcd` function, and then calculates the greatest common divisor of that result and `c` using the `gcd` function again. Finally, it adds the result of this calculation to the `ans` variable.

After the loop is finished, the code prints the value of `ans` to the console.

Note that the `gcd` function is defined using recursion, which is a common technique in Java programming. The function takes two integers as input and returns the greatest common divisor of those two integers. If the second integer is 0, the function returns the first integer. Otherwise, it calls itself with the second integer and the remainder of the first integer divided by the second integer, and returns the result of that call. This allows the function to calculate the greatest common divisor of two numbers recursively.</s>
