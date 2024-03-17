<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1

Expected output:
6.28318530717958623200


```
print(int(input())*6.28)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double output = input * 6.28;
        System.out.println(output);
    }
}
```

This Java code reads an integer from the standard input, multiplies it by 6.28, and then prints the result. The result is a double, which is the equivalent of Python's float.
<|EOT|>
