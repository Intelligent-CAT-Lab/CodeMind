<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
unsa)fe

```
s, w = map(int, input().split())

if w >= s :
    print("unsafe")
else:
    print("safe")
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int w = scanner.nextInt();

        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

This Java code reads two integers from the standard input, and then checks if the second integer is greater than or equal to the first one. If it is, it prints "unsafe"; otherwise, it prints "safe".
<|EOT|>
