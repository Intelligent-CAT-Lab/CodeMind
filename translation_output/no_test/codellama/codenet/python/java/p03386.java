<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A,B,K=map(int,input().split())
X = [p for p in range(A,A+K) if p<=B]
Y = [q for q in range(B-K+1,B+1) if q>=A]
ans = list(set(X+Y))
ans.sort()
for i in ans:
  print(i)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

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
        ans.sort(null);

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `ArrayList` class is used to store the values of `X` and `Y`. The `sort` method is used to sort the elements of `ans` in ascending order. Finally, the `for` loop is used to print the elements of `ans` to the console.</s>
