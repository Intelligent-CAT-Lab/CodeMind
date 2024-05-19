System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000

Expected output:
ABC


```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = a < 1200? "ABC" : "ARC";
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
        Main.main(new String[] {"1000"});
        assertEquals("ABC", System.out.toString().trim());
    }
}
```<|endoftext|>
