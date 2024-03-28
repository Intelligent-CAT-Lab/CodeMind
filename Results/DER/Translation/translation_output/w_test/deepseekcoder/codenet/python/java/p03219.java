<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
81 58

Expected output:
110


```
ab, bc = map(int, input().split())

fare = int(ab + bc/2)

print(fare)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int bc = scanner.nextInt();

        int fare = ab + bc / 2;

        System.out.println(fare);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the fare by adding the first integer to half of the second integer, and then prints the result.
<|EOT|>
