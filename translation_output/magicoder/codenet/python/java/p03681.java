<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
from math import factorial
MAX = 10**9+7
N, M = map(int, input().split())
diff = N-M
if abs(diff)>1:
    print(0)
elif diff == 0:
    print(factorial(N)*factorial(M)*2%MAX)
else:
    print(factorial(N)*factorial(M)%MAX)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = N - M;
        long MAX = (long) Math.pow(10, 9) + 7;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println((factorial(N) * factorial(M) * 2) % MAX);
        } else {
            System.out.println((factorial(N) * factorial(M)) % MAX);
        }
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % MAX;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the standard input, calculates the difference between N and M, and then prints the result of a certain calculation based on the difference. The factorial function is also implemented in Java.<｜end▁of▁sentence｜>
