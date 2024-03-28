<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
64

Expected output:
0.5000000000


```
N = int ( input ( ) )
if N % 2 == 0 :
    print ( 0.5 )
else :
    print ( ( N + 1 ) / N / 2 )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double)(N + 1) / N / 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's even, and prints either 0.5 or (N+1)/N/2 depending on the result of the modulo operation. The division operation in Java is integer division when both operands are integers, so we cast one or both of the operands to `double` to get floating-point division.
<|EOT|>
