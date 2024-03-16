<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
p, m, c = map(int, input().split())
print(p+m+c)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        System.out.println(p + m + c);
    }
}
```<｜end▁of▁sentence｜>
