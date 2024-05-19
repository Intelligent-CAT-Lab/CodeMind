System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
Here's the Java code equivalent to the given Python code:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int MAX = 100000007;
        int diff = N - M;
        if (Math.abs(diff) > 1) {
            System.out.println(0);
        } else if (diff == 0) {
            long factN = factorial(N);
            long factM = factorial(M);
            long result = (factN * factM * 2) % MAX;
            System.out.println(result);
        } else {
            long factN = factorial(N);
            long factM = factorial(M);
            long result = (factN * factM) % MAX;
            System.out.println(result);
        }
    }
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

In this Java code, we first import the `Scanner` class from the `java.util` package to read input from the user. We then define the `MAX` constant and read the values of `N` and `M` from the user using the `Scanner` object.

Next, we calculate the difference between `N` and `M` and check if it is greater than 1. If it is, we print 0 as the result.

If the difference is 0, we calculate the factorial of `N` and `M` using the `factorial` method and then multiply them together and multiply the result by 2. We then take the modulo of the result with `MAX` and print the result.

If the difference is not 0, we calculate the factorial of `N` and `M` using the `factorial` method and then multiply them together. We then take the modulo of the result with `MAX` and print the result.

Finally, we define the `factorial` method that takes an integer `n` as input and returns the factorial of `n` as a `long` value.<|endoftext|>
