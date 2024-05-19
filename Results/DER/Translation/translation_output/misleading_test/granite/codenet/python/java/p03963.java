System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
13

```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = k * (int) Math.pow(k - 1, n - 1);
        System.out.println(result);
    }
}
```

You can test the Java code with the following test case:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        System.setIn(new ByteArrayInputStream("2 2".getBytes()));
        Main.main(new String[0]);
        assertEquals(13, Main.result);
    }
}
```<|endoftext|>
