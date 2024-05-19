System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 0

Expected output:
abab

```
a,b,c = map(int,input().split())

L = [[0] for _ in range(a)] + [[1] for _ in range(b)] + [[2] for _ in range(c)]
while len(L) > 1:
  L[0] += L.pop()
  L.sort()
print(''.join(('a','b','c')[i] for i in L[0]))
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
        sc.close();

        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(Collections.singletonList(0));
        }
        for (int i = 0; i < b; i++) {
            L.add(Collections.singletonList(1));
        }
        for (int i = 0; i < c; i++) {
            L.add(Collections.singletonList(2));
        }
        while (L.size() > 1) {
            List<Integer> first = L.remove(0);
            first.add(L.remove(L.size() - 1).get(0));
            L.add(first);
            Collections.sort(L, new Comparator<List<Integer>>() {
                @Override
                public int compare(List<Integer> o1, List<Integer> o2) {
                    return o1.get(0) - o2.get(0);
                }
            });
        }
        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append("abc".charAt(i));
        }
        System.out.println(sb.toString());
    }
}
```

You can write the following test case in a separate class:

```java
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() {
        Main.main("2 2 0".split(" "));
        assertEquals("abab", System.out.toString().trim());
    }
}
```<|endoftext|>
