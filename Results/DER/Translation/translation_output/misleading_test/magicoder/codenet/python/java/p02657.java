<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5

Expected output:
56

```
L, R = map(int,(input().split()))
print(L*R)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        System.out.println(L * R);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, multiplies them together, and then prints the result. The `split(" ")` function is used to split the input string into an array of strings, where each string is a number. The `Integer.parseInt()` function is used to convert each string into an integer.<｜end▁of▁sentence｜>
