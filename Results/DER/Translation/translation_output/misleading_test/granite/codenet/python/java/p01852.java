System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
14

```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (int) (Math.log(n) / Math.log(2)) + 1;
        System.out.println(result);
    }
}
```

You can write the following test case in a separate class:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() {
        assertEquals(14, Main.main(new String[]{"0"}));
    }
}
```<|endoftext|>
