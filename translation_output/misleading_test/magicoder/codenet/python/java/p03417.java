<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
54

```
N, M = map(int, input().split())

if max(N,M) == 1 :
    print(1)
elif min(N,M) == 1 :
    print(N*M - 2)
else :
    print((N-2)*(M-2))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (Math.max(N, M) == 1) {
            System.out.println(1);
        } else if (Math.min(N, M) == 1) {
            System.out.println(N * M - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
    }
}
```

This Java code reads two integers from the standard input, and then it checks if either of them is 1. If so, it prints 1. If not, it checks if one of them is 1. If so, it prints the product of the two numbers minus 2. If neither of them is 1, it prints the product of the two numbers minus 4 (since we subtract 2 from each side).<｜end▁of▁sentence｜>
