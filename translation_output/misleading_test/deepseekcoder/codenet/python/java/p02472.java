<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
105

```
A,B=[int(i) for i in input().split(" ")]
print(A+B)


```

### Response:
Here is the Java version of the provided Python code:

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

This Java code reads two integers from the standard input (which is typically the keyboard), adds them together, and then prints the result. The `Scanner` class in Java is used to read the input from the user. The `nextInt()` method reads the next integer from the input.
<|EOT|>
