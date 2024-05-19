System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
-50

```
n, k = map(int, input().split())
print(1 if n <= k else 0)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = n <= k? 1 : 0;
        System.out.println(result);
    }
}
```

You can write the following test case in a separate file named `MainTest.java`:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMain() {
        Main.main(new String[]{"5", "10"});
        assertEquals(-50, Main.result);
    }
}
```<|endoftext|>
