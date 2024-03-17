<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
3333


```
a,b=map(int,input().split())
if a<=b:
    print(str(a)*b)
else:
    print(str(b)*a)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a <= b) {
            for (int i = 0; i < b; i++) {
                System.out.print(a);
            }
        } else {
            for (int i = 0; i < a; i++) {
                System.out.print(b);
            }
        }
    }
}
```

This Java code reads two integers from the standard input, and then prints the smaller one repeated as many times as the larger one.<｜end▁of▁sentence｜>
