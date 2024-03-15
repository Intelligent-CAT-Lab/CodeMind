<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
    import java.util.*;
    public class p03478 {
      public static void main(String...args) {
      	final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int A = sc.nextInt();
        final int B = sc.nextInt();
        int ans = 0;
        for(int i = 1; i <= N; i++) {
          int sum = 0;
          for(int j = i; j > 0; j /= 10)
            sum += j % 10;
          if(A <= sum && sum <= B)
            ans += i;
        }
        System.out.println(ans);
      }
    }
```
[/INST]
```python
import sys

N = int(input())
A = int(input())
B = int(input())

ans = 0
for i in range(1, N+1):
    sum = 0
    for j in range(i, 0, -1):
        sum += j % 10
    if A <= sum and sum <= B:
        ans += i

print(ans)
```</s>
