Here is the Python equivalent of the Java code:

```python
import sys

def solve():
    s = input()
    n = len(s)
    idx = [0] * 26
    
    for i in range(n):
        c = ord(s[i]) - ord('a')
        idx[c] += 1
    
    a = [[0] * idx[i] for i in range(26)]

    map = [-1] * n
    ptr = [0] * 26
    odd_used = -1
    for i in range(n):
        c = ord(s[i]) - ord('a')
        
        odd = idx[c] % 2 == 1
        if odd and odd_used >= 0 and odd_used != c:
            print(-1)
            return
        
        p = ptr[c]
        if p < idx[c] // 2:
            map[i] = len(map)
        elif odd and p == idx[c] // 2:
            map[i] = n // 2
            odd_used = c
            
        else:
            inv = idx[c] - p - 1
            map[i] = n - a[c][inv] - 1
        a[c][p] = map[i]
        ptr[c] += 1
    
    array = [0] * n
    for i in range(n):
        array[map[i]] = i
    
    x = bubble_count(array, 0, n)
    print(x)

def bubble_count(a, l, r):
    if r - l <= 1:
        return 0
    m = (l+r)//2
    ret = bubble_count(a, l, m) + bubble_count(a, m, r)
    temp = a[l:r]
    p0, p1, p = 0, m-l, l
    while p < r:
        if p0 == m-l:
            a[p] = temp[p1]
            p1 += 1
        elif p1 == r-l
