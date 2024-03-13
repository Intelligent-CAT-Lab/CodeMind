<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
print(800*N-200*(N//15))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(800*N-200*(N/15));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the expression `800*N-200*(N//15)`, and then prints the result. The `//` operator in Python is equivalent to `/` in Java for integer division.<｜end▁of▁sentence｜>
