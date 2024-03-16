<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println((int)Math.ceil(k/2.0) * (k/2));
    }
}
```

In Java, we use `Scanner` class to get input from the user. The `Math.ceil()` function is used to round up to the nearest integer. The `//` operator performs integer division.<｜end▁of▁sentence｜>
