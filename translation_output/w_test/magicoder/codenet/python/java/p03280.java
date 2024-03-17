<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
1


```
a,b = map(int,input().split())
print((a-1)*(b-1))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a-1)*(b-1));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, subtracts 1 from each, and then multiplies the results. The result is then printed to the console.<｜end▁of▁sentence｜>
