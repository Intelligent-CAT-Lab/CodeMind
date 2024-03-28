<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,k=map(int,input().split())
a=0
for _ in range(n-1):a+=a//(k-1)+1
print(a)
```

### Response:
Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads two integers from the input, initializes a variable `a` to 0, and then adds 1 to `a` for each iteration of the loop. The loop runs `n-1` times. Finally, it prints the value of `a`.
<|EOT|>
