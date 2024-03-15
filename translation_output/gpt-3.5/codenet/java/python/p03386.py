```python
a = int(input())
b = int(input())
k = int(input())
s = set()
cnt = 0

for i in range(a, b+1):
    if cnt >= k:
        break
    cnt += 1
    s.add(i)

cnt = 0
for i in range(b, a-1, -1):
    if cnt >= k:
        break
    cnt += 1
    s.add(i)
    
for ans in sorted(s):
    print(ans)
```
