<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
270


```

h1, m1, h2, m2, k = map(int, input().split())
#ä¸è¡ã§å¥åãããæ°å¤ãããããã®å¤æ°ã«
#3ã¤ä»¥ä¸ãå¯

t1 = 60*h1 + m1
t2 = 60*h2 + m2

print(t2-t1-k)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int k = scanner.nextInt();

        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;

        System.out.println(t2-t1-k);
    }
}
```

This Java code does the same thing as the Python code. It reads five integers from the standard input (which is the console), calculates the total minutes for the first and second times, and then subtracts the time difference and the break time from the total minutes of the second time. The result is then printed to the standard output (console).<｜end▁of▁sentence｜>
