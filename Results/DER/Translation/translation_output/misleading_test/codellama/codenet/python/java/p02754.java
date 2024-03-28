<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 3 4

Expected output:
32

```
n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = n / (a + b);
        int p = n % (a + b);

        System.out.println(k * a + Math.min(p, a));
    }
}
```
This code first prompts the user to enter three integers, `n`, `a`, and `b`, using the `Scanner` class. It then calculates the values of `k` and `p` using the given formulas, and prints the result using `System.out.println()`.

Note that the `Math.min()` method is used to ensure that the result is always non-negative, even if `p` is greater than `a`.</s>
