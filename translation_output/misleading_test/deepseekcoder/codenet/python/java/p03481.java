<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
-18

```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int k = (int)(Math.floor(Y / X) / Double.longBitsToDouble(1L));
        System.out.println(k);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the integer division of `Y` by `X`, and then prints the number of bits in the result. The `Math.floor` function is used to ensure that the division is an integer division, and `Double.longBitsToDouble` is used to convert the result to a double before calling `bit_length()`.
<|EOT|>
