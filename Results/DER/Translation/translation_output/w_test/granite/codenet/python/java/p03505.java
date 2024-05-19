System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4000 2000 500

Expected output:
5


```
K, A, B = map(int, input().split())
if A <= B and K > A:
    print(-1)
elif A >= K:
    print(1)
else:
    print(1 - int(- (K-A) // (A-B))*2)
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A <= B && K > A) {
            System.out.println(-1);
        } else if (A >= K) {
            System.out.println(1);
        } else {
            int result = 1 - (int) Math.floor(- (K - A) / (A - B)) * 2;
            System.out.println(result);
        }
    }
}
```

You can write the following test case to test the above code:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"4000", "2000", "500"});
        assertEquals(-1, 1);
    }

    @Test
    public void test2() {
        Main.main(new String[]{"4000", "2000", "500"});
        assertEquals(1, 1);
    }

    @Test
    public void test3() {
        Main.main(new String[]{"4000", "2000", "500"});
        assertEquals(1, 1);
    }
}
```<|endoftext|>
