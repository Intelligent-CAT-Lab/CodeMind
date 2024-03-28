<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
erow/

```
x,y = map(int,input().split())
print('Brown' if abs(x-y)<=1 else 'Alice')
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (Math.abs(x - y) <= 1) {
            System.out.println("Brown");
        } else {
            System.out.println("Alice");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the absolute difference between them, and then prints "Brown" if the difference is less than or equal to 1, and "Alice" otherwise.
<|EOT|>
