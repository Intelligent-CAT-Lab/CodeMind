<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int gcd = gcd(a, b);
        System.out.println(a + b - gcd + 1);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package. We then define a `main` method where we create a `Scanner` object to read input from the user. We read two integers `a` and `b` from the user. We then call the `gcd` method to calculate the greatest common divisor of `a` and `b`. Finally, we print the sum of `a` and `b` minus the greatest common divisor plus 1.

The `gcd` method is a recursive method that calculates the greatest common divisor of two integers using the Euclidean algorithm. The algorithm works by repeatedly dividing the larger number by the smaller number and replacing the larger number with the smaller number and the smaller number with the remainder until the remainder is 0. The last non-zero remainder is the greatest common divisor.<｜end▁of▁sentence｜>
