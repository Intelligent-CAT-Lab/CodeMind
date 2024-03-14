<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A,s,B = input().split()
A = int(A)
B = int(B)
if s == '+':
    print(A+B)
elif s == '-':
    print(A-B)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[2]);
        String s = parts[1];
        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into parts based on spaces, converts the first and third parts to integers, and then performs the operation specified by the second part (either addition or subtraction) and prints the result.
<|EOT|>
