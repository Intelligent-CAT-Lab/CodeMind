<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
S, T = input().split()

print(T + S)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String S = input[0];
        String T = input[1];

        System.out.println(T + S);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into two parts using a space as the delimiter, and then prints the second part (T) followed by the first part (S).<｜end▁of▁sentence｜>
