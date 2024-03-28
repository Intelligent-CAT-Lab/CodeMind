<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x = int(input())
k = 0
t = 0

if (math.sqrt(8 * x + 1) == math.floor(math.sqrt(8 * x + 1))):
  a = (-1 + math.sqrt(1 + 8 * x))/2
  print(int(a))
else:
  x = (-1 + math.sqrt(1 + 8 * x))//2
  print(int(x) + 1)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int k = 0;
        int t = 0;

        double sqrtValue = 8 * x + 1;
        double sqrt = Math.sqrt(sqrtValue);
        if (sqrt == Math.floor(sqrt)) {
            double a = (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println((int) a);
        } else {
            x = (int) (-1 + Math.sqrt(1 + 8 * x)) / 2;
            System.out.println(x + 1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if the square root of a certain value is an integer, and then prints the result based on the condition.<｜end▁of▁sentence｜>
