<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
13


```
A,B=[int(i) for i in input().split(" ")]
print(A+B)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A + B);
    }
}
```

This Java code reads two integers from the standard input, adds them together, and prints the result. It uses the `Scanner` class to read the input, which is similar to how Python's `input()` function works. The `nextInt()` method is used to read each integer, and the `+` operator is used to add them together.
<|EOT|>
