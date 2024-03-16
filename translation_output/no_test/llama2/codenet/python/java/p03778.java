<s> Translate the following python code to java and enclose your solution inside ```java```:
```
w, a, b = map(int, input().split())

if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)
```

### Hint

- Use the `Scanner` class to read the input.
- Use the `Math` class to calculate the absolute value.
- Use the `System` class to print the output.

### Solution

```java
import java.util.Scanner;
import java.lang.Math;
import java.lang.System;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w, a, b;
        w = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (Math.abs(a - b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a - b) - w);
        }
    }
}
```
</s>
