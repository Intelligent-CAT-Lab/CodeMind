<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
:rO,u

```
# coding: utf-8
a,b=map(int,input().split())
print('Alice' if abs(a-b)>1 else 'Brown')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.abs(a-b) > 1 ? "Alice" : "Brown");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates their absolute difference, and then prints "Alice" if the difference is greater than 1, otherwise it prints "Brown".
<|EOT|>
