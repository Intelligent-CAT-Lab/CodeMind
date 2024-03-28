<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
28

```
import sys
import numpy as np

n = int(sys.stdin.readline().strip())
a = int(np.sqrt(n))
print(str(a*a))
```

### Response:
Here is the Java equivalent of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = (int) Math.sqrt(n);
        System.out.println(a*a);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the square root of that integer, and then prints the square of that integer.
<|EOT|>
