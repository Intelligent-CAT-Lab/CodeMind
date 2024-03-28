<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N = int(input())
print(-(-N//2)/N)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println((double)(-(-N/2))/N);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the result, and then prints it. The `-(-N/2)` part is a trick to ensure that the result is always a positive number, even if N is negative.<｜end▁of▁sentence｜>
