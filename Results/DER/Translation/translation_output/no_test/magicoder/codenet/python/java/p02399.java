<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, raw_input().split())
 
print "%d %d %f" % (a / b, a % b, float(a)/ b)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.printf("%d %d %.6f", a / b, a % b, (double) a / b);
    }
}
```

In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read an integer from the user. The `printf` method is used to print formatted output. The `%d` and `%f` are placeholders for integers and floating-point numbers, respectively. The `%.6f` format specifier is used to print a floating-point number with 6 decimal places.<｜end▁of▁sentence｜>
