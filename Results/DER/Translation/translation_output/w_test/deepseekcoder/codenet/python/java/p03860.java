<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC


```
A,x,C=input().split()
print("A"+x[0]+"C")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A, x, C;
        A = scanner.next();
        x = scanner.next();
        C = scanner.next();
        System.out.println(A + x.charAt(0) + C);
    }
}
```

This Java code reads three strings from the input, and then prints the first character of the second string followed by the other two strings.
<|EOT|>
