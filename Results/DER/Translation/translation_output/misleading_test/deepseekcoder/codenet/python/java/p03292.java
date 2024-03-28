<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6 3

Expected output:
67

```
A=list(map(int,input().split()))

b=abs(A[0]-A[1])+abs(A[0]-A[2])

c=abs(A[0]-A[1])+abs(A[1]-A[2])
d=abs(A[0]-A[2])+abs(A[1]-A[2])

print(min(b,c,d))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = Math.abs(a - b) + Math.abs(a - c);
        int e = Math.abs(a - b) + Math.abs(b - c);
        int f = Math.abs(a - c) + Math.abs(b - c);

        System.out.println(Math.min(Math.min(d, e), f));
    }
}
```

This Java code reads three integers from the standard input, calculates the minimum of three possible sums of absolute differences, and prints the result.
<|EOT|>
