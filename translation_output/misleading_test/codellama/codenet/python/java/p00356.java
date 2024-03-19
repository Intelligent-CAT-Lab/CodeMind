<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
74

```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int result = a + b - gcd + 1;
        System.out.println(result);
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
The `gcd` function is a recursive function that calculates the greatest common divisor of two numbers using the Euclidean algorithm. The `main` function reads two integers from the standard input using the `Scanner` class, calculates the greatest common divisor using the `gcd` function, and prints the result.

The `gcd` function is defined as follows:
```java
public static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}
```
The function takes two integers `a` and `b` as input, and returns the greatest common divisor of `a` and `b`. If `b` is 0, the function returns `a`, which is the greatest common divisor of `a` and `b`. Otherwise, the function recursively calls itself with `b` and `a % b` as input, and returns the result.

The `main` function is defined as follows:
```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int gcd = gcd(a, b);
    int result = a + b - gcd + 1;
    System.out.println(result);
}
```
The function reads two integers `a` and `b` from the standard input using the `Scanner` class, calculates the greatest common divisor using the `gcd` function, and prints the result.

The `main` function is the entry point of the program, and it is called automatically when the program is executed. The `main` function reads two integers from the standard input, calculates the greatest common divisor, and prints the result.

The `gcd` function is a recursive function that calculates the greatest common divisor of two numbers using the Euclidean algorithm. The `main` function reads two integers from the standard input, calculates the greatest common divisor, and prints the result.</s>
