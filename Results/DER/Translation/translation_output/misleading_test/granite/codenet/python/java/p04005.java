System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 3

Expected output:
79

```
l = list(map(int, input().split()))
l = sorted(l)
ans = 0
for i in range(3):
    if l[i] % 2 == 0:
        ans = 0
        break
    else:
        ans = l[0] * l[1]
print(ans)

```


Answer:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[3];
        for (int i = 0; i < 3; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
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
        Main.main("3 3 3".split(" "));
        assertEquals(79, Main.ans);
    }

    @Test
    public void test2() {
        Main.main("1 2 3".split(" "));
        assertEquals(6, Main.ans);
    }

    @Test
    public void test3() {
        Main.main("2 4 6".split(" "));
        assertEquals(48, Main.ans);
    }
}
```<|endoftext|>
