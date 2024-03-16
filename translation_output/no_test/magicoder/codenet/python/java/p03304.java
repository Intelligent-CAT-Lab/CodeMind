<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        if (d > 0) {
            System.out.println(2.0 * (n - d) * (m - 1) / Math.pow(n, 2));
        } else {
            System.out.println((m - 1) / (double) n);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, `n`, `m`, and `d`. If `d` is greater than 0, it calculates and prints the result of the expression `2*(n-d)*(m-1)/n^2`. If `d` is not greater than 0, it calculates and prints the result of the expression `(m-1)/n`.<｜end▁of▁sentence｜>
