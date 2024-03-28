<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = (factorial * i) % 1000000007;
        }
        System.out.println(factorial);
    }
}
```

In this Java code, we use a `Scanner` to read the input from the user. We then calculate the factorial of the input number `n` using a `for` loop. We use the modulo operator `%` to calculate the remainder when the factorial is divided by `1000000007`. The result is then printed to the console.<｜end▁of▁sentence｜>
