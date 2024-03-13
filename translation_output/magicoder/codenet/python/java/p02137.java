<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print(int(int(input()) // 500 * 500))

```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num / 500 * 500);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, divides it by 500, rounds down to the nearest whole number, and then multiplies that by 500. The result is then printed to the console.<｜end▁of▁sentence｜>
