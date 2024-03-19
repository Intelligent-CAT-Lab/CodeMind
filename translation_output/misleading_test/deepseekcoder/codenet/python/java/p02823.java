<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
-61

```
N,A,B = map(int,input().split())
if (A-B)%2==0:
  print((B-A)//2)
else:
  print(min(A-1,N-B)+1+(B-A)//2)
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();

        if ((A - B) % 2 == 0) {
            System.out.println((B - A) / 2);
        } else {
            System.out.println(Math.min(A - 1, N - B) + 1 + (B - A) / 2);
        }
    }
}
```

This Java code reads three integers from the standard input, and then it checks if the difference between `A` and `B` is even. If it is, it prints the result of `(B - A) / 2`. If it's not, it prints the result of `Math.min(A - 1, N - B) + 1 + (B - A) / 2`.

Please note that in Java, the division operator `/` performs integer division when both operands are integers. This means that the result of `(B - A) / 2` will be an integer, even if `B - A` is odd.
<|EOT|>
