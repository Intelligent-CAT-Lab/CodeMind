System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-68

```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = factorial(n);
        System.out.println(result % 1000000007);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
```

You can test this code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FactorialTest {
    @Test
    public void testFactorial() {
        assertEquals(-68, new Factorial().factorial(3) % 1000000007);
    }
}
```<|endoftext|>
