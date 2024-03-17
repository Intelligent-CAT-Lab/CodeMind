<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
84


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
N, A, B = map(int, input().split())
ans = 0
for i in range(1, N+1):
    sum = 0
    for j in range(i, 0, -1):
        sum += j % 10
    if A <= sum <= B:
        ans += i
print(ans)
```</s>
