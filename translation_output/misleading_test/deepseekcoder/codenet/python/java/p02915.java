<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
-92

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
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println((int)Math.pow(n, 3));
        }
        scanner.close();
    }
}
```

This Java code reads integers from the standard input, calculates the cube of each integer, and prints the result. The ```Math.pow()``` function is used to calculate the cube of the number.
<|EOT|>
