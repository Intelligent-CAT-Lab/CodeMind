<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = 0;
        for (int i = 0; i < n - 1; i++) {
            a += a / (k - 1) + 1;
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user (n and k), initializes a to 0, and then performs the same operation in a loop (n-1) times. The result is then printed to the console.<｜end▁of▁sentence｜>
