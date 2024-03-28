<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();

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

        Set<Integer> set = new HashSet<>();
        set.addAll(X);
        set.addAll(Y);

        List<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers A, B, and K from the standard input, generates two lists X and Y, combines them into a set to remove duplicates, converts the set back to a list, sorts the list, and then prints each element of the list.<｜end▁of▁sentence｜>
