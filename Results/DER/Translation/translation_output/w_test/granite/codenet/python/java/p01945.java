System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
2


```
S=list(input())
N=S.index('*')
P=abs(S[0:N].count('(')-S[0:N].count(')'))
Q=abs(S[N+1:len(S)].count('(')-S[N+1:len(S)].count(')'))
print(min(P,Q))

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.indexOf('*');
        int p = Math.abs(count(s.substring(0, n), '(') - count(s.substring(0, n), ')'));
        int q = Math.abs(count(s.substring(n + 1), '(') - count(s.substring(n + 1), ')'));
        System.out.println(Math.min(p, q));
    }

    public static int count(String s, char c) {
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
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
        assertEquals(2, Main.minSwaps("((*)())"));
    }

    @Test
    public void test2() {
        assertEquals(1, Main.minSwaps("(*))"));
    }

    @Test
    public void test3() {
        assertEquals(0, Main.minSwaps("(*)"));
    }
}
```<|endoftext|>
