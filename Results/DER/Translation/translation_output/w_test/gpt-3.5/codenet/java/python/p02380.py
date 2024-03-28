```python
import math

class p02380:
    def run(self, inp):
        a, b, cc = map(float, inp.split())
        cc = math.radians(cc)

        s = a * b * math.sin(cc) / 2.0
        l = a + b + math.sqrt(a * a + b * b - 2.0 * a * b * math.cos(cc))
        h = b * math.sin(cc)

        print("{:.8f}".format(s))
        print("{:.8f}".format(l))
        print("{:.8f}".format(h))

input_string = '4 3 90'
p = p02380()
p.run(input_string)
```
```  
