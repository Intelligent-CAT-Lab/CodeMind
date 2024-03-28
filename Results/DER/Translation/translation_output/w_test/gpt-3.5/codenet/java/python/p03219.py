```python
def upper_bound(a, val, l=0, r=None):
    if r is None:
        r = len(a)
    if r - l == 1:
        if a[l] > val:
            return l
        return r
    mid = (l + r) // 2
    if a[mid] > val:
        return upper_bound(a, val, l, mid)
    else:
        return upper_bound(a, val, mid, r)

def lower_bound(a, val, l=0, r=None):
    if r is None:
        r = len(a)
    if r - l == 1:
        if a[l] < val:
            return r
        return l
    mid = (l + r) // 2
    if a[mid] < val:
        return lower_bound(a, val, mid, r)
    else:
        return lower_bound(a, val, l, mid)

def put(object):
    print(object)

x, y = map(int, input().split())
put(x + y // 2)
```

