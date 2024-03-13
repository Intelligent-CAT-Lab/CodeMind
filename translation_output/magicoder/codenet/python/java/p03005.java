<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N,K=map(int,input().split())
if K==1:
    print(0)
else:
    print(N-K)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user (N and K), and then prints the difference between N and K if K is not equal to 1. If K is equal to 1, it prints 0.<｜end▁of▁sentence｜>
