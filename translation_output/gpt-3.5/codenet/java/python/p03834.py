```python
import sys

try:
    s = input().strip()
    print(s.replace(",", " "))
except Exception as e:
    print(e)
```
