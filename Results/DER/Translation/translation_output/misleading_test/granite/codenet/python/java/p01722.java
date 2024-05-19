System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
73

```
n=int(input())
print(1if n==0else 2//n)
```


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result;
        if (n == 0) {
            result = 1;
        } else {
            result = 2 / n;
        }
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
        Main.main(new String[] {"0"});
        assertEquals(1, Main.result);
    }
}
```<|endoftext|>
