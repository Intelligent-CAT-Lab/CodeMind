System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
87

```
a,b=map(int,input().split())
print(max(a+b,a-b,a*b))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(result);
    }
}
```

You can write the following test case in a separate class to test the functionality of the code:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMax() {
        assertEquals(87, max(3, 1));
    }

    private int max(int a, int b) {
        return Math.max(a + b, Math.max(a - b, a * b));
    }
}
```<|endoftext|>
