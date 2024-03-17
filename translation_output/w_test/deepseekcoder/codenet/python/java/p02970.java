<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 2

Expected output:
2


```
def solve():
    n, d = map(int, input().split())
    print(-(-n//(2*d+1)))


if __name__ == '__main__':
    solve()

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(-(-n/(2*d+1)));
    }
}
```

This Java code reads two integers from the standard input, calculates the expression `-(-n/(2*d+1)` and prints the result. The `-(-a)` is used to perform integer division in Java, which is equivalent to `//` in Python.
<|EOT|>
