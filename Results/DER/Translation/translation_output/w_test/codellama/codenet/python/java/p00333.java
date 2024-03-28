<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 20 5

Expected output:
10


```
from math import gcd
W, H, C = map(int, input().split())
g = gcd(W, H)
print(W*H*C//(g*g))

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        int g = gcd(W, H);
        System.out.println(W*H*C/(g*g));
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
This code uses the `Scanner` class to read input from the user, and the `gcd` function to calculate the greatest common divisor of two numbers. The `gcd` function is defined recursively, and it uses the Euclidean algorithm to find the greatest common divisor of two numbers. The `main` function then calculates the product of the width, height, and color count, and divides it by the square of the greatest common divisor. Finally, it prints the result to the console.</s>
