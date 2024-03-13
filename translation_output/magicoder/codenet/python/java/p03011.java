<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(a + b + c - Math.max(a, Math.max(b, c)));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `nextInt()` method is used to read an integer from the user. The `Math.max()` method is used to find the maximum of three numbers. The sum of the three numbers minus the maximum is then printed.<｜end▁of▁sentence｜>
