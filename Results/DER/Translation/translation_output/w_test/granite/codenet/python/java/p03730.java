System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 5 1

Expected output:
YES


```
a, b, c = list(map(int, input().split()))

def foo(a, b, c):
    seen = set()
    m = a % b
    i = m
    while i not in seen :
        if i == c:
            print("YES")
            return 
        seen.add(i)
        i = (m + i) % b
    print("NO")
foo(a, b, c)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        Set<Integer> seen = new HashSet<>();
        int m = a % b;
        int i = m;
        while (!seen.contains(i)) {
            seen.add(i);
            if (i == c) {
                System.out.println("YES");
                return;
            }
            i = (m + i) % b;
        }
        System.out.println("NO");
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test1() {
        Main.main(new String[] {"7 5 1"});
        assertEquals("YES", output);
    }

    @Test
    public void test2() {
        Main.main(new String[] {"10 3 7"});
        assertEquals("YES", output);
    }

    @Test
    public void test3() {
        Main.main(new String[] {"10 3 8"});
        assertEquals("NO", output);
    }
}
```<|endoftext|>
