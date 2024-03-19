<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
14

```
_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        int result = b / x - (a - 1) / x;

        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, calculates the result, and then prints it. The ```//``` operator in Java is used for integer division, which is equivalent to the ```//``` operator in Python.<｜end▁of▁sentence｜>
