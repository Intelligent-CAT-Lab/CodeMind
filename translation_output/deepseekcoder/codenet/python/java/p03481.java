<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int k = (int)(Math.floor(Y / X) / Double.MIN_VALUE);
        System.out.println(k);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the integer division of Y by X, and then finds the number of bits in the result. The result is printed to the standard output.

Please note that the `Double.MIN_VALUE` is used to convert the division result to a double, because Java does integer division by default and we need a floating point result to calculate the bit length.
<|EOT|>
