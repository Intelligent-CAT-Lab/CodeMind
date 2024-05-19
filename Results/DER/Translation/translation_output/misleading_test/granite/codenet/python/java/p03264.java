System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-21

```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int result = (int) Math.ceil((double) k / 2) * (k / 2);
        System.out.println(result);
    }
}
```

You can write the following test case in a separate class to test the functionality of the code:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testMain() {
        Main.main(new String[]{"3"});
        assertEquals(-21, Main.result);
    }
}
```<|endoftext|>
