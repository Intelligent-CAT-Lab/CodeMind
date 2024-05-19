System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
77

```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long mod = (long)Math.pow(10,9)+7;
        long result = (long)Math.pow(m,n)%mod;
        System.out.println(result);
    }
}
```

You can test this code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMain() {
        Scanner sc = new Scanner("2 3");
        int m = sc.nextInt();
        int n = sc.nextInt();
        long mod = (long)Math.pow(10,9)+7;
        long result = (long)Math.pow(m,n)%mod;
        assertEquals(77, result);
    }
}
```<|endoftext|>
