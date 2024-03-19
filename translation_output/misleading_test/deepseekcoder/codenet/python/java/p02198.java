<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 4

Expected output:
-8

```
N,M=map(int,input().split())
print(N*M)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        System.out.println(N * M);
    }
}
```

This Java code reads two integers from the standard input, multiplies them together, and prints the result. The input is expected to be two space-separated integers.
<|EOT|>
