<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
73

```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int even = n * (n-1) / 2;
        int odd = m * (m-1) / 2;
        System.out.println(even + odd);
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `n` and `m`. It then calculates the sum of the even numbers from 1 to `n` and the sum of the odd numbers from 1 to `m`, and prints the result.

Note that in Java, the `/` operator is used for integer division, which returns the integer part of the result. To get the same result as the Python code, you need to use the `//` operator, which returns the integer part of the result and discards the fractional part.</s>
