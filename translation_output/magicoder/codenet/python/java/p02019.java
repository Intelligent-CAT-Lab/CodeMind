<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int c = Integer.parseInt(input[3]);
        System.out.println(n - (c + a - c + b - c));
    }
}
```<｜end▁of▁sentence｜>
