System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-13 3

Expected output:
41

```
a, b=map(int, input().split())
print(max(a-b, a+b, a*b))

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = Math.max(Math.max(a - b, a + b), a * b);
        System.out.println(result);
    }
}
```

You can run this code with the following test case:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMaxOfThree() {
        Main main = new Main();
        String input = "-13 3";
        main.input = input;
        main.run();
        assertEquals("41", main.output.get(0));
    }
}
```<|endoftext|>
