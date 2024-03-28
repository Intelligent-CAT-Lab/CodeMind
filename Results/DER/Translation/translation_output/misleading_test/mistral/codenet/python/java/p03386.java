<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            X.add(A + i);
        }
        for (int i = 0; i < B - K + 1; i++) {
            Y.add(B - K + i);
        }
        Set<Integer> ans = new HashSet<>(X);
        ans.addAll(Y);
        List<Integer> sortedAns = new ArrayList<>(ans);
        sortedAns.sort(Collections.reverseOrder());
        for (int i : sortedAns) {
            System.out.println(i);
        }
    }
}
```</s>
