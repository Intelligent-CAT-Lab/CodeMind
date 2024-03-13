<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input().split()
print(int(s[0]) - int(s[1]))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
    }
}
```<｜end▁of▁sentence｜>
