System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8
3

```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int result = IntStream.range(1, 1501).reduce(1, (x, y) -> x * y);
        System.out.println(result + 2);

        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + 1);
        }
    }
}
```

To test the Java code, you can use the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testPythonCode() {
        assertEquals(8, IntStream.range(1, 1501).reduce(1, (x, y) -> x * y) + 2);
    }

    @Test
    public void testForLoop() {
        String[] args = {"2"};
        Main.main(args);
        assertEquals("3\n4\n", System.out.toString());
    }
}
```<|endoftext|>
