System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
0.5000000000


```
N = int(input())
print(-(-N//2)/N)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double result = -(-N/2) / (double) N;
        System.out.println(result);
    }
}
```

You can write the following test case in a separate file named `MainTest.java`:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test() {
        Main main = new Main();
        assertEquals(0.5, main.calculate(4), 0.0000000001);
    }
}
```<|endoftext|>
