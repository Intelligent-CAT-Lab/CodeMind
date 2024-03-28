<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
2000


```
a,b=map(int,input().split())
print((a+b)//2)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a + b) / 2);
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextInt()` method is used to read the next integer from the input. The `/` operator performs integer division, which rounds down to the nearest whole number.<｜end▁of▁sentence｜>
