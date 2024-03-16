```python
import sys

str = input()
ch = [str[i:i+1] for i in range(4)]

a = int(ch[0])
b = int(ch[1])
c = int(ch[2])
d = int(ch[3])

ans = [None, None, None]

if a + b + c + d == 7:
    ans = ["+", "+", "+"]
elif a + b + c - d == 7:
    ans = ["+", "+", "-"]
elif a + b - c + d == 7:
    ans = ["+", "-", "+"]
elif a - b + c + d == 7:
    ans = ["-", "+", "+"]
elif a + b - c - d == 7:
    ans = ["+", "-", "-"]
elif a - b + c - d == 7:
    ans = ["-", "+", "-"]
elif a - b - c + d == 7:
    ans = ["-", "-", "+"]
elif a - b - c - d == 7:
    ans = ["-", "-", "-"]

print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7")
```

