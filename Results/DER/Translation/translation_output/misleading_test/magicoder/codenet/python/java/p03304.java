<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1

Expected output:
-95.59809439141243

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

This Java code reads three integers from the standard input (which is usually the console), and then it calculates and prints the result based on the conditions in the Python code. The `Math.pow(n, 2)` is used to calculate the square of `n`, and `(m - 1) / (double) n` is used to convert the integer division result to a double.<｜end▁of▁sentence｜>
