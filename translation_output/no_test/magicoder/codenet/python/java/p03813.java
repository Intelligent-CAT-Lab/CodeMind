<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a < 1200 ? "ABC" : "ARC");
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, and then prints "ABC" if the integer is less than 1200, otherwise it prints "ARC".<｜end▁of▁sentence｜>
