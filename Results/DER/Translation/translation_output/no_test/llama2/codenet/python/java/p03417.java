<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N, M = map(int, input().split())

if max(N,M) == 1 :
    print(1)
elif min(N,M) == 1 :
    print(N*M - 2)
else :
    print((N-2)*(M-2))

```

### Input

The first line of input contains two integers N and M.

### Output

Print the number of ways to color the grid.

### Constraints

1 <= N, M <= 100

### Example Input

```
4 3
```

### Example Output

```
1
```

### Explanation

The grid is a 4x3 grid.

### Hint

Use a 2D array to store the grid.

### Solution

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] grid = new int[N][M];
        int ans = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        if(N == 1 || M == 1) {
            ans = 1;
        } else {
            for(int i = 0; i < N; i++) {
                for(int j = 0; j < M; j++) {
                    if(grid[i][j] == 1) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```
</s>
