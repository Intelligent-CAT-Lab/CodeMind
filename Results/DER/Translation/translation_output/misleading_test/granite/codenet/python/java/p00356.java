System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
74

```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        int result = a + b - gcd + 1;
        System.out.println(result);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```

You can test the Java code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testGcd() {
        assertEquals(1, gcd(1, 1));
        assertEquals(1, gcd(2, 1));
        assertEquals(2, gcd(2, 2));
        assertEquals(3, gcd(3, 9));
    }

    @Test
    public void testMain() {
        assertEquals(74, main(4, 4));
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    private static int main(int a, int b) {
        int gcd = gcd(a, b);
        int result = a + b - gcd + 1;
        return result;
    }
}
```<|endoftext|>
