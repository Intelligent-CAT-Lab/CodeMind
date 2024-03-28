<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
5


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

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `gcd` function is defined to calculate the greatest common divisor of two numbers.
* The `main` function is the entry point of the program, where the input is read and the `gcd` function is called to calculate the result.
* The `gcd` function uses the Euclidean algorithm to calculate the greatest common divisor of two numbers.
* The `result` variable is calculated by adding the two numbers, subtracting the greatest common divisor, and adding 1.
* The `System.out.println` statement is used to print the result to the console.</s>
