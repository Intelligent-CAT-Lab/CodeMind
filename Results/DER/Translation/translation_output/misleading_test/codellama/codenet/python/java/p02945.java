<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-13 3

Expected output:
41

```
a, b=map(int, input().split())
print(max(a-b, a+b, a*b))

```
[/INST]
```java
import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a - b, Math.max(a + b, a * b));
        System.out.println(max);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.max()` method to find the maximum of three numbers. The `Math.max()` method takes three arguments, and returns the largest of them. In this case, we are passing the result of `a - b`, `a + b`, and `a * b` as arguments to `Math.max()`, and the result is the maximum of these three numbers.</s>
