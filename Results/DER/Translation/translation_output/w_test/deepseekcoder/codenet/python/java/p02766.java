<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11 2

Expected output:
4


```
n,k = map(int, input().split())
i = 0

while n//k**i != 0:
    i += 1

print(i)

```

### Response:
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

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the power of k until n/k^i becomes 0, and then prints the value of i.
<|EOT|>
