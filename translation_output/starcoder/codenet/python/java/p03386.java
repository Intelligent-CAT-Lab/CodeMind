<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,K=map(int,input().split())
X = [p for p in range(A,A+K) if p<=B]
Y = [q for q in range(B-K+1,B+1) if q>=A]
ans = list(set(X+Y))
ans.sort()
for i in ans:
  print(i)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int K = sc.nextInt();
        List<Integer> X = new ArrayList<>();
        List<Integer> Y = new ArrayList<>();
        for (int i = A; i <= A + K; i++) {
            if (i <= B) {
                X.add(i);
            }
        }
        for (int i = B - K + 1; i <= B; i++) {
            if (i >= A) {
                Y.add(i);
            }
        }
        List<Integer> ans = new ArrayList<>();
        ans.addAll(X);
        ans.addAll(Y);
        Collections.sort(ans);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```
<|endoftext|>
