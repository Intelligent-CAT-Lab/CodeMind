System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
4


```
n = int(input())

def dfs(s):
    if int(s) > n:
        return 0
    ret = 1 if all(s.count(c) > 0 for c in '753') else 0
    for c in '753':
        ret += dfs(s + c)
    return ret

print(dfs('0'))
```


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = dfs(0, n);
        System.out.println(result);
    }

    public static int dfs(int s, int n) {
        if (s > n) {
            return 0;
        }
        int ret = 1;
        if (s == 0 || s % 10 == 7 || s % 10 == 5 || s % 10 == 3) {
            ret = 0;
            for (int i = 0; i <= 9; i++) {
                if (i == 7 || i == 5 || i == 3) {
                    continue;
                }
                ret += dfs(s * 10 + i, n);
            }
        }
        return ret;
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
public class MainTest {
    @Test
    public void testDfs() {
        assertEquals(4, dfs(0, 575));
    }
}
```<|endoftext|>
