<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
5 -69

```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
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
        scanner.close();

        int minAB = Math.min(A, B);
        int maxAB = Math.max(A + B - N, 0);

        System.out.println(minAB + " " + maxAB);
    }
}
```

This Java code reads three integers from the standard input (N, A, B), calculates the minimum of A and B, and the maximum of A+B-N, but if the result is negative, it prints 0. The results are then printed to the standard output.
<|EOT|>
