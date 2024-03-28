<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N, M = map(int, input().split())
a = []
for i in range(M):
    a.append(int(input()))
num = N - M
ans = 0
while(num):
    ans += 1
    num -= 1
print(ans - 1)

```

### Input

The first line of input contains two integers N and M.

The second line of input contains M space separated integers.

### Output

Print the answer to the last line of input.

### Constraints

1 <= N <= 100000

1 <= M <= 100000

1 <= a[i] <= 100000

### Example Input

```
4 3
1 2 3
```

### Example Output

```
2
```

### Explanation

The first line of input contains 4 and 3.

The second line of input contains 3 space separated integers.

The answer is 2.

### Hint

Use a while loop to iterate over the input.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = sc.nextInt();
        }
        int num = N - M;
        int ans = 0;
        while (num > 0) {
            ans++;
            num--;
        }
        System.out.println(ans - 1);
    }
}
```
</s>
