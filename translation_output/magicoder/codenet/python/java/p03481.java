<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math

n = list(map(int,input().split()))
X = n[0]
Y = n[1]

k = (Y//X).bit_length()
print(k)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        int k = (int)(Math.log(Y/X) / Math.log(2));
        System.out.println(k);
    }
}
```

In Java, we use the `Scanner` class to read input from the user. The `Math.log()` function is used to calculate the logarithm of a number, and `Math.log(2)` is used to calculate the base-2 logarithm. The `//` operator performs integer division, which is equivalent to the `//` operator in Python. The `Math.log()` function returns a double, so we cast it to an integer with `(int)`.<｜end▁of▁sentence｜>
