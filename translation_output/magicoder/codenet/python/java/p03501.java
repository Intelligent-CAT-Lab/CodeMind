<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N,A,B=map(int,input().split())

print(min(A*N,B))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(Math.min(A * N, B));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user (N, A, and B), and then prints the minimum of A*N and B.<｜end▁of▁sentence｜>
