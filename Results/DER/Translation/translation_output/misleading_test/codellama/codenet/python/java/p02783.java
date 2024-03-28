<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 4

Expected output:
88

```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println((int) Math.ceil(H / A));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.ceil()` method to round up the result of the division to the nearest integer. The `Math.ceil()` method returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument and is equal to a mathematical integer.

The `int` cast is used to convert the result of the division to an integer, which is then printed to the console.

Note that the `Math.ceil()` method is used instead of `Math.round()` because the question asks for the result to be rounded up to the nearest integer, not rounded to the nearest whole number.</s>
