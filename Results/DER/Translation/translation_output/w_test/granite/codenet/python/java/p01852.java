System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0


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
        int result = 0;
        if (n > 0) {
            result = Integer.toBinaryString(n).length() - 2;
        }
        System.out.println(result);
    }
}
```

You can write the following test case in a separate file named `MainTest.java`:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() {
        assertEquals(0, Main.main(new String[]{"0"}));
        assertEquals(1, Main.main(new String[]{"1"}));
        assertEquals(2, Main.main(new String[]{"2"}));
        assertEquals(3, Main.main(new String[]{"3"}));
        assertEquals(4, Main.main(new String[]{"4"}));
        assertEquals(5, Main.main(new String[]{"5"}));
        assertEquals(6, Main.main(new String[]{"6"}));
        assertEquals(7, Main.main(new String[]{"7"}));
        assertEquals(8, Main.main(new String[]{"8"}));
        assertEquals(9, Main.main(new String[]{"9"}));
        assertEquals(10, Main.main(new String[]{"10"}));
    }
}
```<|endoftext|>
