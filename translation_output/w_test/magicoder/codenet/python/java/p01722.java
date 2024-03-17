<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
1


```
n=int(input())
print(1if n==0else 2//n)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n == 0 ? 1 : 2 / n);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then prints `1` if the integer is `0`, otherwise it prints `2` divided by the integer.<｜end▁of▁sentence｜>
