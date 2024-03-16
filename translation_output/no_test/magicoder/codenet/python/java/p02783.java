<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
H, A = map(int, input().split())
print(math.ceil(H/A))
```

@@ Response
```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int A = scanner.nextInt();
        System.out.println((int) Math.ceil((double) H / A));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. We then calculate the ceiling of the division of `H` by `A` and print the result. The `Math.ceil` function is used to round up to the nearest integer. The `(double)` cast is used to ensure that the division operation results in a floating-point number, which is then passed to `Math.ceil`.<｜end▁of▁sentence｜>
