<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 20

Expected output:
3


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

        int k = (int)(Math.floor(Y / X) / 2);
        int result = Integer.toBinaryString(k).length();
        System.out.println(result);
    }
}
```

This Java code reads two integers from the standard input, calculates the integer division of Y by X, and then calculates the number of bits in the binary representation of the result. The result is printed to the standard output.

Please note that the bit_length() function in Python returns the number of bits required to represent the number in binary, excluding the sign and leading zeros. In Java, we can't directly get the number of bits in an integer, so we convert it to a binary string and get its length.
<|EOT|>
