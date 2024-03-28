<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print(a + a ** 2 + a ** 3)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + (int)Math.pow(a, 2) + (int)Math.pow(a, 3));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextInt()` method is used to read an integer from the user. Then, we use the `Math.pow()` method to calculate the power of `a` and `a^2` and `a^3`. The result is then printed to the console.<｜end▁of▁sentence｜>
