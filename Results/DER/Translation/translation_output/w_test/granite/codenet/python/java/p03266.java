System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
9


```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if (k % 2 == 1) {
            ans = (long)Math.pow(n / k, 3);
        } else {
            ans = (long)Math.pow(n / k, 3) + (long)Math.pow((n + k / 2) / k, 3);
        }
        System.out.println(ans);
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
        Scanner sc = new Scanner("3 2");
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if (k % 2 == 1) {
            ans = (long)Math.pow(n / k, 3);
        } else {
            ans = (long)Math.pow(n / k, 3) + (long)Math.pow((n + k / 2) / k, 3);
        }
        assertEquals(9, ans);
    }

    @Test
    public void test2() {
        Scanner sc = new Scanner("5 3");
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if (k % 2 == 1) {
            ans = (long)Math.pow(n / k, 3);
        } else {
            ans = (long)Math.pow(n / k, 3) + (long)Math.pow((n + k / 2) / k, 3);
        }
        assertEquals(27, ans);
    }

    @Test
    public void test3() {
        Scanner sc = new Scanner("10 4");
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if (k % 2 == 1) {
            ans = (long)Math.pow(n / k, 3);
        } else {
            ans = (long)Math.pow(n / k, 3) + (long)Math.pow((n + k / 2) / k, 3);
        }
        assertEquals(125, ans);
    }
}
```<|endoftext|>
