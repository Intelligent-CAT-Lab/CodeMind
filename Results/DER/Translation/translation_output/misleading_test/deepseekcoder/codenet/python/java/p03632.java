<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 75 25 100

Expected output:
41

```
A, B, C, D = map(int, input().split())
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print(0)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        scanner.close();

        int ans = Math.min(B,D) - Math.max(A,C);

        if(ans > 0) {
            System.out.println(ans);
        } else {
            System.out.println(0);
        }
    }
}
```

This Java code reads four integers from the standard input, calculates the difference between the minimum of the second and fourth integers and the maximum of the first and third integers, and prints the result. If the result is negative or zero, it prints 0.
<|EOT|>
