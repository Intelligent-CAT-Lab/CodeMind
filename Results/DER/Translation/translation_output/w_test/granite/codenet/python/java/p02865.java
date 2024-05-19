System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4

Expected output:
1


```
n=int(input())
print((n-1)//2)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n - 1) / 2);
    }
}
```

You can write the following test case in a separate class:

```java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test() {
        Main main = new Main();
        assertEquals(1, main.main(4));
    }
}
```<|endoftext|>
