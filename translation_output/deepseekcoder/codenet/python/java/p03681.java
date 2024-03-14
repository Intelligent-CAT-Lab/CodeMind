<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final long MAX = (long)Math.pow(10, 9) + 7;
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        long diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            System.out.println(factorial(N, MAX) * factorial(M, MAX) * 2 % MAX);
        } else {
            System.out.println(factorial(N, MAX) * factorial(M, MAX) % MAX);
        }
    }

    public static long factorial(int num, long max) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result = (result * i) % max;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates their difference, and then prints the factorial of the larger number multiplied by the factorial of the smaller number (or twice the factorial of the larger number if the difference is 0). The result is taken modulo ```10^9+7``` to prevent overflow. The factorial function is also modified to take a second argument for the modulo value.
<|EOT|>
