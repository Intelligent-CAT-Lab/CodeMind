System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
2 1


```
# seishin.py
K, N = map(int, input().split())
if K % 2 == 0:
    print(*[K//2] + [K]*(N-1))
else:
    X = [(K+1)//2] * N
    for i in range(N//2):
        if X[-1] == 1:
            X.pop()
        else:
            X[-1] -= 1
            X.extend([K]*(N-len(X)))
    print(*X)

```


Answer:
```java
import java.util.*;

public class Seishin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        if (K % 2 == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(K / 2 + " ");
            }
        } else {
            int[] X = new int[N];
            Arrays.fill(X, (K + 1) / 2);
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    Arrays.fill(X, N - 1, N, K);
                } else {
                    X[N - 1]--;
                    Arrays.fill(X, N - X[N - 1], N, K);
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
        }
    }
}
```

You can write the following test cases to ensure it works correctly:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class SeishinTest {
    @Test
    public void test1() {
        Seishin.main(new String[]{"3 2"});
        assertEquals("2 1", output());
    }

    @Test
    public void test2() {
        Seishin.main(new String[]{"4 3"});
        assertEquals("2 2 1", output());
    }

    @Test
    public void test3() {
        Seishin.main(new String[]{"5 4"});
        assertEquals("3 2 2 1", output());
    }

    private String output() {
        return new Scanner(System.out).useDelimiter("\\A").next();
    }
}
```<|endoftext|>
