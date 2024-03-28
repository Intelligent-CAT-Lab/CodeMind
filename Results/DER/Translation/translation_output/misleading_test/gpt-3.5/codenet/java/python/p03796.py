```python
import math

cnt = int(input())
power = 1
for i in range(1, cnt+1):
    power = (power*i)%(math.pow(10, 9) + 7)
print(int(power))
```
