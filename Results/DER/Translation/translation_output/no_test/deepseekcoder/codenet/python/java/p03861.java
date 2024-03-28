<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int result = b / x - (a - 1) / x;

        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the result as the difference between the integer division of `b` by `x` and the integer division of `a - 1` by `x`, and then prints the result.
<|EOT|>
