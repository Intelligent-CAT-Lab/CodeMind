<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11 2

Expected output:
0

```
n,k = map(int, input().split())
i = 0

while n//k**i != 0:
    i += 1

print(i)

```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```

This Java code reads two integers from the standard input, `n` and `k`, and then calculates the smallest integer `i` such that `k` to the power of `i` is greater than or equal to `n`. It then prints `i` to the standard output.
<|EOT|>
