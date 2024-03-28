<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
87

```
a,b=map(int,input().split())
print(max(a+b,a-b,a*b))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = max(a + b, a - b, a * b);
        System.out.println(result);
    }

    public static int max(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }
}
```
Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `max()` method is used to find the maximum of three integers.
* The `Math.max()` method is used to find the maximum of two integers.
* The `Math.max()` method is used to find the maximum of three integers.
* The `System.out.println()` method is used to print the result to the console.

Note: The `Math.max()` method can also be used to find the maximum of more than three integers by chaining multiple `Math.max()` methods together. For example, `Math.max(a, Math.max(b, c))` will find the maximum of `a`, `b`, and `c`.</s>
