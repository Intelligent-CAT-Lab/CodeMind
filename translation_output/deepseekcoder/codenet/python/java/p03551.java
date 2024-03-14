<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int time = 1900*M + (N-M)*100;
        System.out.println(time * (1 << M));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the time as per the formula given in the Python code, and then prints the result of the calculation. The `<<` operator is used to calculate 2 to the power M in Java.
<|EOT|>
