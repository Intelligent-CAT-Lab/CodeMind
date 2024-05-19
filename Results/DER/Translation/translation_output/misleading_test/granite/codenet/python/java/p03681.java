System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
51

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
            long result = ((long) factorial(N) * (long) factorial(M) * 2) % MAX;
            System.out.println(result);
        } else {
            long result = ((long) factorial(N) * (long) factorial(M)) % MAX;
            System.out.println(result);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"2 2"});
        assertEquals(51, Main.result);
    }

    @Test
    public void test2() {
        Main.main(new String[]{"3 2"});
        assertEquals(0, Main.result);
    }

    @Test
    public void test3() {
        Main.main(new String[]{"4 3"});
        assertEquals(24, Main.result);
    }
}
```<|endoftext|>
