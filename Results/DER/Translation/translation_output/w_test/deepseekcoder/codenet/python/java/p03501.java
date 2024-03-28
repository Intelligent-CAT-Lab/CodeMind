<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 17 120

Expected output:
119


```
N,A,B=map(int,input().split())

print(min(A*N,B))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(Math.min(A*N, B));
    }
}
```

This Java code reads three integers from the standard input (N, A, and B), and prints the minimum of A*N and B.
<|EOT|>
