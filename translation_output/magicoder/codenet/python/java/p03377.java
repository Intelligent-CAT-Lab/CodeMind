<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```<｜end▁of▁sentence｜>
