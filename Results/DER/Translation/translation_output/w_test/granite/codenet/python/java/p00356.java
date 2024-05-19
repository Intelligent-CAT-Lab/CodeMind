System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4

Expected output:
5


```
import math
a,b = map(int,input().split())
print(a+b-(math.gcd(a,b))+1)

```


Answer:
Here's the Java code equivalent to the Python code:

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
        assertEquals(1, Main.gcd(1, 1));
        assertEquals(2, Main.gcd(2, 2));
        assertEquals(2, Main.gcd(2, 4));
        assertEquals(3, Main.gcd(3, 9));
    }

    @Test
    public void testMain() {
        Scanner sc = new Scanner("4 4");
        assertEquals(5, Main.main(sc));
    }
}
```<|endoftext|>
