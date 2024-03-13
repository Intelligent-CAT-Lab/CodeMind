<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(k * Math.pow(k - 1, n - 1));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, `n` and `k`, and then prints the result of `k * (k - 1)^(n - 1)`.<｜end▁of▁sentence｜>
