<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
            System.out.println((N + 1.0) / N / 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, checks if it's even, and prints either 0.5 or (N+1)/2N. The division operation in Java is performed using `/`, but since we're dealing with integers, the result will be an integer. To get a floating-point result, we need to make at least one of the operands a floating-point number, which is done by adding `.0` or `1.0`.
<|EOT|>
