<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
1 76

```
a, b, k = map(int, input().split())
if a <= k:
    k -= a
    a = 0
else:
    print(a - k, b)
    exit()
print(0, max(b - k, 0))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            System.exit(0);
        }

        System.out.println("0 " + Math.max(b - k, 0));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.max()` method to calculate the maximum value between two numbers.

The `if` statement checks if `a` is less than or equal to `k`, and if it is, it subtracts `a` from `k` and sets `a` to 0. If `a` is greater than `k`, it prints the difference between `a` and `k` and the value of `b`, and then exits the program using `System.exit(0)`.

The `else` block prints 0 and the maximum value between `b - k` and 0.

The `System.out.println()` statements are used to print the output to the console.</s>
