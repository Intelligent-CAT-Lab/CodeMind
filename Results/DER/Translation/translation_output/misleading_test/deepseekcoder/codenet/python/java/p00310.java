<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 10 20

Expected output:
-57

```
p, m, c = map(int, input().split())
print(p+m+c)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int m = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(p + m + c);
    }
}
```

This Java code reads three integers from the standard input (keyboard), adds them together, and then prints the result. The `Scanner` class in Java is used to read the input from the user. The `nextInt()` method of the `Scanner` class is used to read the next integer from the input.
<|EOT|>
