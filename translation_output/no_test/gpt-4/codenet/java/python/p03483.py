Here's the translated Python code:

```python
from collections import Counter

def solve(s):
    n = len(s)
    idx = Counter(s)

    a = {char: [0]*count for char, count in idx.items()}

    map_ = [-1]*n

    ptr = Counter()
    now = 0
    odd_used = ''
    for i, c in enumerate(s):
        odd = idx[c] % 2 == 1
        if odd and odd_used and odd_used != c:
            print(-1)
            return
        
        p = ptr[c]
        if p < idx[c] // 2:
            map_[i] = now
            now += 1
        elif odd and p == idx[c] // 2:
            map_[i] = n // 2
            odd_used = c
        else:
            inv = idx[c] - p - 1
            map_[i] = n - a[c][inv] - 1
        
        a[c][p] = map_[i]
        ptr[c] += 1

    array = [-1] * n
    for i, m in enumerate(map_):
        array[m] = i
    
    x = bubble_count(array, 0, n)
    print(x)

def bubble_count(a, l, r):
    if r - l <= 1:
        return 0
    
    m = (l + r) // 2
    ret = bubble_count(a, l, m) + bubble_count(a, m, r)

    temp = a[l:r]
    p0 = 0
    p1 = m - l
    p = l
    
    while p < r:
        if p0 == m - l:
            a[p] = temp[p1]
            p += 1
            p1 += 1
        elif p1 == r - l:
            a[p] = temp[p0]
            p += 1
            p0 += 1
        elif temp[p0] <= temp[p1]:
            a[p] = temp[p0]
            p += 1
            p0 += 1
        else:
            a[p] = temp[p1]
            p += 1
            p1 += 1
            ret += m - l - p0
    
    return ret

# The main function that runs the solve() function with the input,
# this should be modified or integrated into the rest of your Python code as needed.
def main():
    s = input()
    solve(s)

# Uncomment the following line if you want to run the main function directly
# main()
```

This Python code assumes input is given via `input()` which is a common method for interactive input in Python. The Java code's main method and various I/O utility methods have been omitted, since they're usually managed differently in Python. The `solve()` function can be called directly with the string input, as shown in the `main()` function. Uncomment the `main()` invocation to enable interactive execution.
