```python
import sys

try:
    input_str = sys.stdin.readline().strip().split(' ')
    A = int(input_str[0])
    P = int(input_str[1])
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception :", e)
```
