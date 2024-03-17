<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3 5

Expected output:
3 0


```
N,A,B = map(int,input().split())
print(min(A,B),max(A+B-N,0))
```

### Response:
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

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the minimum of the first two and the maximum of the third one, and prints the results. The maximum calculation ensures that the result is never negative.
<|EOT|>
