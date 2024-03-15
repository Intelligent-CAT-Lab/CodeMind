
```
w, h = map(int, input().split())
if w == 1 or h == 1:
    print(1)
else:
    c = (w*h)//2
    if (w*h)%2 == 1:
        c += 1
    print(c)
```
/p02742.py
w, h = map(int, input().split())
if w == 1 or h == 1:
    print(1)
else:
    c = (w*h)//2
    if (w*h)%2 == 1:
        c += 1
    print(c)

