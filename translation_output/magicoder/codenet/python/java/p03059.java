<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, t = map(int, input().split())
print((t // a) * b)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int t = Integer.parseInt(input[2]);
        System.out.println((t / a) * b);
    }
}
```<｜end▁of▁sentence｜>
