<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        List<List<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(new ArrayList<>());
        }
        for (int i = 0; i < b; i++) {
            L.add(Arrays.asList(1));
        }
        for (int i = 0; i < c; i++) {
            L.add(Arrays.asList(2));
        }
        while (L.size() > 1) {
            L.add(L.remove(0));
            L.sort(Comparator.comparingInt(list -> list.get(0)));
        }
        String result = "";
        for (int i = 0; i < L.get(0).size(); i++) {
            result += (char) ('a' + L.get(0).get(i));
        }
        System.out.println(result);
    }
}
```</s>
