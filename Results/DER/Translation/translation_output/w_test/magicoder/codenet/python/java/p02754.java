<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 3 4

Expected output:
4


```
n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int k = n / (a + b);
        int p = n % (a + b);

        System.out.println(k * a + Math.min(p, a));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input (which is usually the console), calculates the number of times `a` can be added to `k`, and then adds the minimum of `p` and `a` to the result. The result is then printed to the standard output.<｜end▁of▁sentence｜>
