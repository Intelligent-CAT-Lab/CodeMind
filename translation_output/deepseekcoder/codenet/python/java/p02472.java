<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        System.out.println(A + B);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, adds them together, and prints the result. The input is expected to be two integers separated by a space.
<|EOT|>
