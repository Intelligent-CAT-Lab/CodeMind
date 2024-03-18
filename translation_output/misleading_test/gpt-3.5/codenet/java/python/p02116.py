```python
import sys

str_input = input()

if not str_input:
    sys.exit(0)

res = int(str_input)
han = 0
ni_beki = 1
ruijyo = 0

while True:
    han = (res >> ruijyo) % 2
    if han == 0:
        res = (res % ni_beki) + 1
        break
    else:
        ni_beki *= 2
        ruijyo += 1

print(res)
```
