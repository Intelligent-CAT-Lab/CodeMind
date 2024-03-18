```python
import math

input_vals = input().split()
input_vals = list(map(float, input_vals))

result = math.sqrt((input_vals[0] - input_vals[2])**2 + (input_vals[1] - input_vals[3])**2)
print(result)
```
