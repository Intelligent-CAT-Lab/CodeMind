```python
import sys

input_data = sys.stdin.readline().split()
N = int(input_data[0])
M = int(input_data[1])
ans = 0

if N > M:
    print(M//2)
    sys.exit(0)

if N == 1 and M == 1:
    print(0)
    sys.exit(0)

if N == 2 and M == 1:
    print(0)
    sys.exit(0)

if N * 2 > M:
    print(M//2)
    sys.exit(0)

ans = N + ((M - N * 2) // 4)
print(ans)
```

