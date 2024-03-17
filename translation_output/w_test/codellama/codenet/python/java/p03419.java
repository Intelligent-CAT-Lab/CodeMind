<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
0


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

Explanation:

* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `if` statement checks if either `n` or `m` is equal to 1. If so, the program prints 1.
* If neither `n` nor `m` is equal to 1, the program prints the product of `(n - 2)` and `(m - 2)`.

Note: The `Scanner` class is part of the `java.util` package, so you need to import it at the beginning of your code.</s>
