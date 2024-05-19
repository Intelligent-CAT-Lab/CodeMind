System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
77

```
from collections import Counter

MOD = 10**9 + 7
N = int(input())
count = Counter()
ans = 1
num = []

for i in range(2, N+1):
    
    for n in num:
        while not i % n:
            count[n] += 1
            i //= n
        if i == 1:
            break
    else:
        num.append(i)
        count[i] = 1
        
for n in count.values():
    ans = ans * (n+1) % MOD
print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MOD = (int)Math.pow(10, 9) + 7;
        int N = sc.nextInt();
        Map<Integer, Integer> count = new HashMap<>();
        int ans = 1;
        List<Integer> num = new ArrayList<>();

        for (int i = 2; i <= N; i++) {
            for (int n : num) {
                while (i % n == 0) {
                    count.put(n, count.getOrDefault(n, 0) + 1);
                    i /= n;
                }
                if (i == 1) {
                    break;
                }
            }
            if (i!= 1) {
                num.add(i);
                count.put(i, 1);
            }
        }

        for (int n : count.values()) {
            ans = (ans * (n + 1)) % MOD;
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
        Main.main(new String[]{"3"});
        assertEquals(77, Main.ans);
    }

    @Test
    public void test2() {
        Main.main(new String[]{"5"});
        assertEquals(120, Main.ans);
    }

    @Test
    public void test3() {
        Main.main(new String[]{"10"});
        assertEquals(1680, Main.ans);
    }
}
```<|endoftext|>
