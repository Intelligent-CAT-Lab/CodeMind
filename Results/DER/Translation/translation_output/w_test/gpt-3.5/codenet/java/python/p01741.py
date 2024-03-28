```python
import math

class p01741:
  def run(self, d):
    d = float(d)
    if d < 1:
        return d * math.sqrt(2)
    elif d < math.sqrt(2):
        return 2.0
    elif d < 2:
        return d * math.sqrt(2)
    elif d < math.sqrt(2) * 1.5:
        return 3.0
    else:
        return d * math.sqrt(2)

# Test the code with the provided input
input_val = "1.000"
result = p01741().run(input_val)
print("{:.12f}".format(result))
```
