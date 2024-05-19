System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 6

Expected output:
-50

```
x,y=map(int,input().split())
print(x if x%y else -1)
```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int result = x % y == 0? -1 : x;
        System.out.println(result);
    }
}
```

You can test this code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        System.setIn(new ByteArrayInputStream("8 6".getBytes()));
        assertEquals(-50, Main.main(new String[]{}));
    }
}
```<|endoftext|>
