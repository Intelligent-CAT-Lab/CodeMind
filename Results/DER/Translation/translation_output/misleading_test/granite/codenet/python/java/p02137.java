System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5700

Expected output:
5416

```
print(int(int(input()) // 500 * 500))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = (int) Math.floor(input / 500.0) * 500;
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
        Main.main(new String[] {"5700"});
        assertEquals(5416, Main.result);
    }
}
```<|endoftext|>
