```python
def p03146():
    s = int(input())
    set_nums = set()
    set_nums.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        
        if s in set_nums:
            print(i)
            return
        else:
            set_nums.add(s)

p03146()
```
