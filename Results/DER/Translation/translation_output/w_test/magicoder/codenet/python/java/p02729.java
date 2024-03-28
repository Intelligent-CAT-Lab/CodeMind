<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
1


```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long even = n * (long)(n-1) / 2;
        long odd = m * (long)(m-1) / 2;

        System.out.println(even + odd);
    }
}
```

In Java, we use the `Scanner` class to read input from the user. The `nextInt()` method is used to read an integer from the user. The `/` operator performs integer division in Java, so we need to cast one of the operands to `long` to avoid integer division.<｜end▁of▁sentence｜>
