<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2 1 1

Expected output:
39

```
a, b, c, d = map(int, input().split())
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, a * c);
        ans = Math.max(ans, a * d);
        ans = Math.max(ans, b * c);
        ans = Math.max(ans, b * d);
        System.out.println(ans);
    }
}
```

This Java code reads four long integers from the standard input, calculates the maximum of the products of the pairs (a, c), (a, d), (b, c), and (b, d), and prints the result.
<|EOT|>
