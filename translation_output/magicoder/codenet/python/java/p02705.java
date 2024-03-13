<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print(int(input())*6.28)
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        double result = input * 6.28;
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, multiplies it by 6.28, and then prints the result. The `Scanner` class is used to read the user's input.<｜end▁of▁sentence｜>
