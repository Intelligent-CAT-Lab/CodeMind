System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3 4

Expected output:
-64

```
a,b,c=map(int,input().split())
print(a+b+c-max(a,b,c))
```


Answer:
Here's the Java code equivalent to the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max = Math.max(a, Math.max(b, c));
        int result = a + b + c - max;
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
        System.setIn(new ByteArrayInputStream("1 3 4".getBytes()));
        Main.main(new String[0]);
        assertEquals(-64, Main.result);
    }
}
```<|endoftext|>
