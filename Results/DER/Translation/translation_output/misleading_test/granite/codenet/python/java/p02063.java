System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 6

Expected output:
-12

```
A,B = map(int,input().split())

if B%A == 0:
    print(-1)
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print(k*A)
        exit()
print(-1)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (B % A == 0) {
            System.out.println(-1);
            return;
        }

        int k = -(-B / A);

        for (int i = k; i < k + 1000000; i++) {
            int rem = i * A % B;
            int an = rem / A;
            int bn = i - an;
            int n = bn + an + rem;
            if (n > i) {
                System.out.println(i * A);
                return;
            }
        }
        System.out.println(-1);
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
        Main.main(new String[]{"4", "6"});
        assertEquals(-12, 0);
    }

    @Test
    public void test2() {
        Main.main(new String[]{"1", "10"});
        assertEquals(10, 0);
    }

    @Test
    public void test3() {
        Main.main(new String[]{"1", "1"});
        assertEquals(-1, 0);
    }

    @Test
    public void test4() {
        Main.main(new String[]{"10", "2"});
        assertEquals(-1, 0);
    }
}
```<|endoftext|>
