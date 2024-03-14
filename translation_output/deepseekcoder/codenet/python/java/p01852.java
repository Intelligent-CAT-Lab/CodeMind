<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(Integer.toBinaryString(n).length() - 2);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, converts it to binary, and prints the length of the binary string minus 2. If the input number is 0, it prints 0.
<|EOT|>
