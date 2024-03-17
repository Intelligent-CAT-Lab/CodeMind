<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
3


```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println((3*a+p)/2);
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the next integer from the input. The `System.in` is the standard input stream which is used to read data from the keyboard. The `//` operator is used for integer division in Java.<｜end▁of▁sentence｜>
