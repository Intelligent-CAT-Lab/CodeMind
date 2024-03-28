<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the expression `-(-n/(2*d+1)` and prints the result. The `-(-n/(2*d+1)` is equivalent to `math.ceil(n/(2*d+1))` in Python. It rounds up the division result to the nearest integer.
<|EOT|>
