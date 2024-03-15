```python
import sys

for line in sys.stdin:
    values = list(map(int, line.split()))
    if len(values) == 0:
        break

    H, R = values

    if H < 0 and abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)
```
