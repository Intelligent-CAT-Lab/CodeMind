System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
575

Expected output:
-32

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
        if (s!= 0 && hasAllDigits(s)) {
            ret = 0;
        }
        for (int i = 0; i < 4; i++) {
            ret += dfs(s * 10 + i, n);
        }
        return ret;
    }

    public static boolean hasAllDigits(int s) {
        boolean[] digits = new boolean[4];
        while (s!= 0) {
            int digit = s % 10;
            if (digit!= 3 && digit!= 5 && digit!= 7) {
                return false;
            }
            digits[digit] = true;
            s /= 10;
        }
        return digits[3] && digits[5] && digits[7];
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
public class MainTest {
    @Test
    public void testDfs() {
        assertEquals(1, dfs(0, 100));
        assertEquals(1, dfs(3, 100));
        assertEquals(1, dfs(5, 100));
        assertEquals(1, dfs(7, 100));
        assertEquals(1, dfs(35, 100));
        assertEquals(1, dfs(53, 100));
        assertEquals(1, dfs(75, 100));
        assertEquals(1, dfs(357, 100));
        assertEquals(1, dfs(537, 100));
        assertEquals(1, dfs(753, 100));
        assertEquals(1, dfs(3575, 100));
        assertEquals(1, dfs(5375, 100));
        assertEquals(1, dfs(7537, 100));
        assertEquals(1, dfs(35753, 100));
        assertEquals(1, dfs(53753, 100));
        assertEquals(1, dfs(75375, 100));
        assertEquals(1, dfs(357537, 100));
        assertEquals(1, dfs(537537, 100));
        assertEquals(1, dfs(753753, 100));
        assertEquals(1, dfs(3575375, 100));
        assertEquals(1, dfs(5375375, 100));
        assertEquals(1, dfs(7537537, 100));
        assertEquals(1, dfs(35753753, 100));
        assertEquals(1, dfs(53753753, 100));
        assertEquals(1, dfs(75375375, 100));
        assertEquals(1, dfs(357537537, 100));
        assertEquals(1, dfs(537537537, 100));
        assertEquals(1, dfs(753753753, 100));
        assertEquals(1, dfs(3575375375, 100));
        assertEquals(1, dfs(5375375375, 100));
        assertEquals(1, dfs(7537537537, 100));
        assertEquals(1, dfs(35753753753, 100));
        assertEquals(1, dfs(53753753753, 100));
        assertEquals(1, dfs(75375375375, 100));
        assertEquals(1, dfs(357537537537, 100));
        assertEquals(1, dfs(537537537537, 100));
        assertEquals(1, dfs(753753753753, 100));
        assertEquals(1, dfs(3575375375375, 100));
        assertEquals(1, dfs(5375375375375, 100));
        assertEquals(1, dfs(7537537537537, 100));
        assertEquals(1, dfs(35753753753753, 100));
        assertEquals(1, dfs(53753753753753, 100));
        assertEquals(1, dfs(75375375375375, 100));
        assertEquals(1, dfs(357537537537537, 100));
        assertEquals(1, dfs(537537537537537, 100));
        assertEquals(1, dfs(753753753753753, 100));
        assertEquals(1, dfs(3575375375375375, 100));
        assertEquals(1, dfs(5375375375375375, 100));
        assertEquals(1, dfs(7537537537537537, 100));
        assertEquals(1, dfs(35753753753753753, 100));
        assertEquals(1, dfs(53753753753753753, 100));
        assertEquals(1, dfs(75375375375375375, 100));
        assertEquals(1, dfs(357537537537537537, 100));
        assertEquals(1, dfs(537537537537537537, 100));
        assertEquals(1, dfs(753753753753753753, 100));
        assertEquals(1, dfs(3575375375375375375, 100));
        assertEquals(1, dfs(5375375375375375375, 100));
        assertEquals(1, dfs(7537537537537537537, 100));
        assertEquals(1, dfs(35753753753753753753, 100));
        assertEquals(1, dfs(53753753753753753753, 100));
        assertEquals(1, dfs(75375375375375375375, 100));
        assertEquals(1, dfs(357537537537537537537, 100));
        assertEquals(1, dfs(537537537537537537537, 100));
        assertEquals(1, dfs(753753753753753753753, 100));
        assertEquals(1, dfs(3575375375375375375375, 100));
        assertEquals(1, dfs(5375375375375375375375, 100));
        assertEquals(1, dfs(7537537537537537537537, 100));
        assertEquals(1, dfs(35753753753753753753753, 100));
        assertEquals(1, dfs(53753753753753753753753, 100));
        assertEquals(1, dfs(75375375375375375375375, 100));
        assertEquals(
