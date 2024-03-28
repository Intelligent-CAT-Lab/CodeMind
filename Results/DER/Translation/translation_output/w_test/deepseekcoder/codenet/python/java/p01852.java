<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Integer.toBinaryString(n).length() - (n == 0 ? 0 : 2));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, converts it to binary using `Integer.toBinaryString(n)`, and then prints the length of the binary string minus 2 (if the number is not zero) or 0 (if the number is zero).
<|EOT|>
