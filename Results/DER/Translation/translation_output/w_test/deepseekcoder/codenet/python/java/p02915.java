<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8


```
import sys
for n in sys.stdin:
	n = int(n.split()[0])
	print(n ** 3)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n * n * n);
    }
}
```

This Java code reads an integer from the standard input, calculates its cube (i.e., multiplies the number by itself twice), and prints the result. The equivalent Python code reads a line from the standard input, splits it into words, converts the first word to an integer, calculates its cube, and prints the result.
<|EOT|>
