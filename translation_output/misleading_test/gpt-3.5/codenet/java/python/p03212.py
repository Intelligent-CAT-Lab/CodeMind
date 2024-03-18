```python
from collections import deque

def addChar(s, location, c):
    return s[:location] + c + s[location:]

def p03212(N):
    set_ = set()
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 0
    ch = ['3', '5', '7']
    
    if N < 1000:
        for s in queue:
            if int(s) <= N:
                count += 1
        return count
    
    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for j in range(len(ch)):
                    temp = addChar(s, i, ch[j])
                    if temp not in set_:
                        set_.add(temp)
                        queue.append(temp)

    return count

# Test case
N = 575
result = p03212(N)
print(result)
```

