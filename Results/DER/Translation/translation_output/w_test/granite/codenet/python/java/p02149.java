System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = scanner.nextInt();
        }
        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }
        switch (maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void test1() {
        Main.main(new String[]{"1000 900 850"});
        assertEquals("A", Main.output.get(0));
    }

    @Test
    public void test2() {
        Main.main(new String[]{"1000 850 900"});
        assertEquals("B", Main.output.get(0));
    }

    @Test
    public void test3() {
        Main.main(new String[]{"850 1000 900"});
        assertEquals("C", Main.output.get(0));
    }
}
```<|endoftext|>
