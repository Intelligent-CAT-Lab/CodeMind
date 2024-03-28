```python
S = int(input())
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60
print(str(h) + ":" + str(m) + ":" + str(s))
```
