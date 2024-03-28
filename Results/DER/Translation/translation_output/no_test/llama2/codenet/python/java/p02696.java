<s> Translate the following python code to java and enclose your solution inside ```java```:
```
from math import floor
A, B, N = map(int, input().split())
print(floor(A*min(B-1, N)/B))
```

### Input

The first line contains three integers `A`, `B` and `N`.

### Output

Print the result of the operation.

### Constraints

- `1 <= A <= 10^9`
- `1 <= B <= 10^9`
- `1 <= N <= 10^9`

### Sample Input

```
3 5 10
```

### Sample Output

```
3
```

### Explanation

The output is `3` because `3*min(5-1, 10)/5 = 3`.
</s>
