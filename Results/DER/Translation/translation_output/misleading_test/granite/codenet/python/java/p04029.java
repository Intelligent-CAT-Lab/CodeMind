System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
62

```
n = int(input())
print(int((n + 1) * n / 2)) 
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = (n + 1) * n / 2;
        System.out.println(result);
    }
}
```

You can write the following test case in a separate class:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void testMain() {
        Main.main(new String[] {"3"});
        assertEquals(62, Main.result);
    }
}
```<|endoftext|>
