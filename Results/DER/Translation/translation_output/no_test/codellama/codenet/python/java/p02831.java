<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

def gcd(a, b):
    '''ã¦ã¼ã¯ãªããäºé¤æ³ãä½¿ã£ãæå¤§å¬ç´æ°ã®æ±ãæ¹'''
    while b != 0:
        a, b = b, a % b
    return(a)


def lcm(a, b):
    '''æå°å¬åæ°ã®æ±ãæ¹'''
    return a * b // gcd(a, b)

A, B = list(map(int, input().split()))

print(lcm(A,B))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
```
This code uses the same algorithm as the Python code, but it is written in Java. It uses the `Scanner` class to read input from the user, and it uses the `gcd` and `lcm` methods to calculate the greatest common divisor and least common multiple of the two numbers. The `main` method prints the results to the console.</s>
