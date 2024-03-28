<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
31

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

This Java code reads two integers from the standard input (console), and then it checks if `K` is equal to 1. If it is, it prints 0. Otherwise, it prints the difference between `N` and `K`.

You can test this code with the following test input:

```
3 2
```

And the expected output should be:

```
31
```<｜end▁of▁sentence｜>
