```python
import sys
import math

r = float(sys.stdin.readline())
pi = math.pi
x = r * r * pi
y = 2 * r * pi
print("{:.6f} {:.6f} {:.6f}".format(x, y, -r * r * pi / 2))
```
