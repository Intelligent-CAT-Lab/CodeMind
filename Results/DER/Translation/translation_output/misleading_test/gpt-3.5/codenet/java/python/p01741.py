```python
import math

class p01741:
    def run(self, d):
        d = float(d)
        if d < 1:
            return d * math.sqrt(2)
        elif d < math.sqrt(2):
            return 2
        elif d < 2:
            return d * math.sqrt(2)
        elif d < math.sqrt(2) * 1.5:
            return 3
        else:
            return d * math.sqrt(2)

# Test the code with the given sample input
output = p01741().run(1.000)
print(output)
```
