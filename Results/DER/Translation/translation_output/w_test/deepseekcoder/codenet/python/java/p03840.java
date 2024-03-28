<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 1 0 0 0 0

Expected output:
3


```
I, O, T, J, L, S, Z = map(int, input().split())
if I and J and L:
  a = ((I-1)//2 + (J-1)//2 + (L-1)//2)*2 + 3 + O
else:
  a = 0
b = (I//2 + J//2 + L//2)*2 + O
ans = max(a, b)
print(ans)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int J = scanner.nextInt();
        int L = scanner.nextInt();
        int O = scanner.nextInt();
        int T = scanner.nextInt();
        int S = scanner.nextInt();
        int Z = scanner.nextInt();

        int a;
        if (I > 0 && J > 0 && L > 0) {
            a = ((I-1)/2 + (J-1)/2 + (L-1)/2)*2 + 3 + O;
        } else {
            a = 0;
        }
        int b = (I/2 + J/2 + L/2)*2 + O;
        int ans = Math.max(a, b);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads seven integers from the input, and then calculates the value of `a` and `b` based on the conditions in the Python code. Finally, it prints the maximum of `a` and `b`.
<|EOT|>
