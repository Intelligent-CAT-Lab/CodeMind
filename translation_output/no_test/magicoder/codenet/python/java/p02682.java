<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c, k = map(int, input().split())
ans = 0
ans += 1*( min(a, k) )
k -= min(a, k)
ans += 0*( min(b, k) )
k -= min(b, k)
ans += (-1)*( min(c, k) )
k -= min(c, k)
print(ans)
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
        int k = scanner.nextInt();
        int ans = 0;
        ans += Math.min(a, k);
        k -= Math.min(a, k);
        ans += 0 * Math.min(b, k);
        k -= Math.min(b, k);
        ans -= Math.min(c, k);
        k -= Math.min(c, k);
        System.out.println(ans);
    }
}
```

Please note that in Java, we don't have a direct equivalent to Python's `map()` function. Instead, we use `nextInt()` to read the next integer from the input. Also, the `*` operator in Python is used for multiplication, but in Java, we use `*` for bitwise multiplication. Therefore, we use `Math.min()` to get the minimum value between two numbers.<｜end▁of▁sentence｜>
