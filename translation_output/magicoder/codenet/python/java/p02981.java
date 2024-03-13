<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int ans = (n * a > b) ? b : n * a;

        System.out.println(ans);
    }
}
```<｜end▁of▁sentence｜>
