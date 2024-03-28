<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
82

```
N,K = map(int,input().split())

print(N-(K-1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        System.out.println(N - (K - 1));
    }
}
```

This Java code reads two integers from the standard input, calculates the result as N - (K - 1), and prints it to the standard output.
<|EOT|>
