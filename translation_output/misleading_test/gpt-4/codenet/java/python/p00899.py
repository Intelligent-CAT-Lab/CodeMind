Here is the translated Python code:

```python
import re
from itertools import combinations

def main():
    while True:
        N = int(input())
        if N == 0:
            break
        solve(N)

def solve(N):
    str_list = [input().strip() for _ in range(N)]

    # Remove redundant strings that are subsequences of others
    str_list = [s for s in str_list if not any(s in other for other in str_list if s != other)]
    N2 = len(str_list)

    # Calculate the overlapping lengths between all pairs
    len_matrix = [[0] * N2 for _ in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            len_i = len(str_list[i])
            for offset in range(len_i):
                if str_list[j].startswith(str_list[i][offset:]):
                    len_matrix[i][j] = len(str_list[j]) - (len_i - offset)
                    break

    # Use Dynamic Programming to minimize the concatenation of strings
    dp = [[float('inf')] * N2 for _ in range(1 << N2)]
    for i in range(N2):
        dp[1 << i][i] = len(str_list[i])
    
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] == float('inf'):
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                new_idx = i | (1 << k)
                dp[new_idx][k] = min(dp[new_idx][k], dp[i][j] + len_matrix[j][k])

    # Get the answer from the last line of dp table
    ans = min(dp[-1])
    print(ans)

if __name__ == '__main__':
    main()
```

Test this Python script using the provided input:

Test input:
```
3
aba
ababa
abaaba
```

Expected output:
```
4
```
