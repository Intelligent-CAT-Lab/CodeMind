<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6

Expected output:
2


```
s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();

        if (s * 2 <= c) {
            System.out.println(c / 2);
        } else {
            System.out.println(s + ((c - s * 2) / 4));
        }
    }
}
```

This Java code reads two integers from the standard input, `s` and `c`, and then prints the result of the condition in the Python code. The condition checks if `s * 2` is less than or equal to `c`, and if so, it prints `c / 2`. Otherwise, it prints `s + ((c - s * 2) / 4)`.
<|EOT|>
