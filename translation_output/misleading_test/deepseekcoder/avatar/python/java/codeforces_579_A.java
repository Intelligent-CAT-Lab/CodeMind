<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
9

Expected output:
-12

```
import math
n = int ( input ( ) )
x = 1
while math . log2 ( n ) % 1 :
    x += 1
    n -= 2 ** ( int ( math . log2 ( n ) ) )
print ( x )


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while ((Math.log10(n) / Math.log10(2)) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) (Math.log10(n) / Math.log10(2)));
        }
        System.out.println(x);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then subtracts powers of 2 from it until the number becomes 0. The number of subtractions is the output.

Please note that in Java, `Math.log10(n) / Math.log10(2)` is used to calculate the base-2 logarithm of `n`, which is equivalent to `math.log2(n)` in Python.
<|EOT|>
