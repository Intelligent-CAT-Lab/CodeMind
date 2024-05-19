System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
-14

```
r=int(input())
print(3*(r**2))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int result = 3 * (r * r);
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
    public void testMain() {
        Main.main(new String[] {"4"});
    }
}
```<|endoftext|>
