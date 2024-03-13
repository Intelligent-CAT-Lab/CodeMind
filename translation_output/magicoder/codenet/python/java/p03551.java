<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int time = 1900*M + (N-M)*100;
        System.out.println(time * Math.pow(2, M));
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers from the user, calculates a time value, and then prints the result of that calculation multiplied by 2 raised to the power of M.<｜end▁of▁sentence｜>
