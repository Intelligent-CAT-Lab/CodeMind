<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

from math import gcd
W, H, C = map(int, input().split())
g = gcd(W, H)
print(W*H*C//(g*g))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int C = scanner.nextInt();
        int g = gcd(W, H);
        System.out.println(W * H * C / (g * g));
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
This code uses the `Scanner` class to read input from the user, and the `gcd` method to calculate the greatest common divisor of two numbers. The `gcd` method is defined as a recursive function that uses the Euclidean algorithm to find the greatest common divisor of two numbers. The `main` method then calculates the result of the multiplication and division, and prints it to the console.</s>
