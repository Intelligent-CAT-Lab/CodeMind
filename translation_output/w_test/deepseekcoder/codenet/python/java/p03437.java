<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
16


```
x,y=map(int,input().split())
print(x if x%y else -1)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x % y == 0 ? -1 : x);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, checks if the first one is divisible by the second one, and prints the first one if it is not, or -1 if it is.
<|EOT|>
