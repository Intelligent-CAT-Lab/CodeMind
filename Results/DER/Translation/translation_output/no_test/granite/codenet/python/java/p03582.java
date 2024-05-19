System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

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
            List<Integer> first = L.get(0);
            first.set(0, first.get(0) + L.remove(L.size() - 1).get(0));
            L.sort(Comparator.comparingInt(l -> l.get(0)));
        }

        StringBuilder sb = new StringBuilder();
        for (int i : L.get(0)) {
            sb.append("abc".charAt(i));
        }
        System.out.println(sb.toString());
    }
}
```<|endoftext|>
