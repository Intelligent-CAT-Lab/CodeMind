Here's the translated Java code into Python:

```python
a = int(input())
b = int(input())
c = int(input())
i = 0
cnt = 0
while cnt < c:
    i += 1
    cnt += a
    if i % 7 == 0:
        cnt += b

print(i)
```
