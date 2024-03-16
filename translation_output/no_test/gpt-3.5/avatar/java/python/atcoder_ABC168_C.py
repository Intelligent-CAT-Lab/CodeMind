```python
import math

def atcoder_ABC168_C():
    a, b, tmp1, tmp2 = map(float, input().split())
    
    h = tmp1 / 6. * math.pi + tmp2 / 30. * math.pi / 12.
    m = tmp2 / 30. * math.pi + tmp1 / 6. * math.pi * 12.
    rad = h - m
    
    res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2. * a * b * math.cos(rad)))
    
    print(res)

if __name__ == "__main__":
    atcoder_ABC168_C()
```
