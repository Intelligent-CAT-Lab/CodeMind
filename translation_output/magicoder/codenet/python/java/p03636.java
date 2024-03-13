<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,*b,c = input()
print(a+str(len(b))+c)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("");
        String a = parts[0];
        String c = parts[parts.length - 1];
        StringBuilder b = new StringBuilder();
        for (int i = 1; i < parts.length - 1; i++) {
            b.append(parts[i]);
        }
        System.out.println(a + b.length() + c);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into parts, and then prints the first part, the length of the middle part, and the last part.<｜end▁of▁sentence｜>
