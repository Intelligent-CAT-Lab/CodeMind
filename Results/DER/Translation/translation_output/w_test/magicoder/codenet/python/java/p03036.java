<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 10 20

Expected output:
30
50
90
170
330
650
1290
2570
5130
10250


```
r,d,x = (int(i) for i in input().split())

for i in range(1,11):
    x = r*x-d
    print(x)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int d = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

This Java code reads three integers from the standard input (console), and then it performs the same operation as the Python code. It prints the result of the operation for the first 10 iterations.<｜end▁of▁sentence｜>
