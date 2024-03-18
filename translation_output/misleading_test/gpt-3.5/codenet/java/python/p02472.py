```python
import sys
from typing import List
from math import isqrt

def solve(input_list: List[int]) -> int:
    a, b = input_list
    return a - isqrt(b)

if __name__ == "__main__":
    input_list = list(map(int, input().split()))
    result = solve(input_list)
    print(result)
```
