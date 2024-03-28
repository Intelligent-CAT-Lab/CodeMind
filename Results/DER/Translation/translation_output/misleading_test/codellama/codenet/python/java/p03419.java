<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-68

```
n, m = map(int, input().split())
if n == 1 or m == 1:
    print(1 if n * m == 1 else max(n, m) - 2)
else:
    print((n - 2) * (m - 2))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n == 1 || m == 1) {
            System.out.println(1);
        } else {
            System.out.println((n - 2) * (m - 2));
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then uses the `nextInt()` method to read the two integers `n` and `m`. It then checks if either `n` or `m` is equal to 1, and if so, it prints 1. Otherwise, it calculates the product of `n` and `m` and subtracts 2 from the result, which is then printed.

Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read the next integer from the input. The `System.out.println()` method is used to print the result to the console.</s>
