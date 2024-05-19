System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 2

Expected output:
3
4
7
8
-17

```
A,B,K=map(int,input().split())
X = [p for p in range(A,A+K) if p<=B]
Y = [q for q in range(B-K+1,B+1) if q>=A]
ans = list(set(X+Y))
ans.sort()
for i in ans:
  print(i)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        List<Integer> X = new ArrayList<>();
        for (int p = A; p < A + K; p++) {
            if (p <= B) {
                X.add(p);
            }
        }

        List<Integer> Y = new ArrayList<>();
        for (int q = B - K + 1; q <= B; q++) {
            if (q >= A) {
                Y.add(q);
            }
        }

        List<Integer> ans = new ArrayList<>(X);
        ans.addAll(Y);
        Collections.sort(ans);

        for (int i : ans) {
            System.out.println(i);
        }
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
        Main.main(new String[]{"3 8 2"});
        assertEquals(3, System.out.read());
        assertEquals(4, System.out.read());
        assertEquals(7, System.out.read());
        assertEquals(8, System.out.read());
        assertEquals(-17, System.out.read());
    }

    @Test
    public void test2() {
        Main.main(new String[]{"1 10 3"});
        assertEquals(1, System.out.read());
        assertEquals(2, System.out.read());
        assertEquals(3, System.out.read());
        assertEquals(4, System.out.read());
        assertEquals(5, System.out.read());
        assertEquals(6, System.out.read());
        assertEquals(7, System.out.read());
        assertEquals(8, System.out.read());
        assertEquals(9, System.out.read());
        assertEquals(10, System.out.read());
    }
}
```<|endoftext|>
