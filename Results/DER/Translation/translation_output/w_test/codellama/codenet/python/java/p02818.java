<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
0 2


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
            System.out.println(a - k + " " + Math.max(b - k, 0));
            return;
        }

        System.out.println("0 " + Math.max(b - k, 0));
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the input.
* The `Math.max()` method is used to find the maximum of two numbers.
* The `return` statement is used to exit the method early if the condition is met.
* The `System.out.println()` method is used to print the output.

Note: The code assumes that the input is a single line of three integers separated by spaces.</s>
