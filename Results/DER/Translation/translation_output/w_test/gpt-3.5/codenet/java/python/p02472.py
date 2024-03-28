```python
import sys
from itertools import islice
 
def solve(A, B):
    return A + B
 
if __name__ == "__main__":
    input_data = sys.stdin.readline().strip()
    A, B = map(int, input_data.split())
    output = solve(A, B)
    print(output)
```
