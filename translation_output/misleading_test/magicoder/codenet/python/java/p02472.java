<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        System.out.println(A + B);
    }
}
```

This Java code reads the input from the user, splits it into two parts, converts each part into an integer, and then adds them together. The result is then printed to the console.<｜end▁of▁sentence｜>
