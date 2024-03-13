<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c, d = map(int, input().split())
ans = -1000000000000000000
ans = max(ans, a * c, a * d, b * c, b * d)
print(ans)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();
        long d = scanner.nextLong();
        long ans = -1000000000000000000L;
        ans = Math.max(ans, a * c);
        ans = Math.max(ans, a * d);
        ans = Math.max(ans, b * c);
        ans = Math.max(ans, b * d);
        System.out.println(ans);
    }
}
```

In Java, we use ```long``` instead of ```int``` for the variables ```a```, ```b```, ```c```, and ```d``` because the maximum value of ```int``` is smaller than the maximum value of ```long```. Also, ```Math.max()``` is used instead of ```max()``` to find the maximum of two or more numbers.<｜end▁of▁sentence｜>
