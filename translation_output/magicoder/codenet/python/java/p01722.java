<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
print(1if n==0else 2//n)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n == 0 ? 1 : 2 / n);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's zero, and then prints either 1 or 2 divided by the number.<｜end▁of▁sentence｜>
