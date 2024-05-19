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

        List<Integer> ans = new ArrayList<>();
        for (int i = A; i <= B; i++) {
            if (i <= B - K + 1) {
                ans.add(i);
            }
            if (i >= A && i <= B - K + 1) {
                ans.add(i);
            }
        }

        Collections.sort(ans);
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

Test input:
```
3 8 2
```

Expected output:
```
3
4
7
8
```<|endoftext|>
