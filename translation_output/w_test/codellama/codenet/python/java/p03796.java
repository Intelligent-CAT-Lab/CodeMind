<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```
[/INST]
```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n) % 1000000007);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```
This code uses a recursive approach to calculate the factorial of a given number. It first takes an input from the user using the `Scanner` class, then it calculates the factorial of that number using the `factorial` method, and finally it prints the result modulo 1000000007.

Note that the `factorial` method is a recursive method, which means that it calls itself repeatedly until it reaches the base case (in this case, when `n` is 0). The base case returns 1, and the recursive case returns the product of `n` and the factorial of `n - 1`. This allows the method to calculate the factorial of any positive integer.</s>
