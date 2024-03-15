Below is the given Java code translated to Python:

```python
a = int(input())
b = int(input())
c = int(input())
StringA = str(a)
StringB = str(b)
StringC = str(c)

if a >= b and a >= c:
    if b >= c:
        print(int(StringA + StringB) + c)
    else:
        print(int(StringA + StringC) + b)
elif b >= a and b >= c:
    if a >= c:
        print(int(StringB + StringA) + c)
    else:
        print(int(StringB + StringC) + a)
else:
    if a >= b:
        print(int(StringC + StringA) + b)
    else:
        print(int(StringC + StringB) + a)
```
