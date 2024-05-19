System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
a = int(input())
print(a + a ** 2 + a ** 3)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int result = a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3);
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
    public void testMain() {
        Main.main(new String[] {"2"});
    }
}
```<|endoftext|>
