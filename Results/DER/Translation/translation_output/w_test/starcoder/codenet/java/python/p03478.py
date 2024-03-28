<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    N, A, B = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        sum = 0
        for j in str(i):
            sum += int(j)
        if A <= sum and sum <= B:
            ans += i
    print(ans)

if __name__ == "__main__":
    main()
```
<|endoftext|>
