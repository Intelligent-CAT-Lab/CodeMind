<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N,K = map(int, input().split())
t = n = a = 1
while True:
    n = (K+a-1)//K
    a += n;
    if  N < a: break
    t += 1
print(t)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int t = 1;
        int n = 1;
        int a = 1;
        while (true) {
            n = (K + a - 1) / K;
            a += n;
            if (N < a) break;
            t += 1;
        }
        System.out.println(t);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, then it calculates the number of times `n` can be incremented until `a` exceeds `N`. The result is then printed to the console.<｜end▁of▁sentence｜>
