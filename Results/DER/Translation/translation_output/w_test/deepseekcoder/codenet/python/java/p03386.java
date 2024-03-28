<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

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

This Java code does the same thing as the Python code. It reads three integers A, B, and K from the input, generates two lists X and Y, combines them into a set, sorts the set into a list, and prints the elements of the list.
<|EOT|>
