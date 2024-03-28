```python
from collections import Counter

def solve(s):
    n = len(s)
    idx = Counter(s)
    
    a = {c: [0] * count for c, count in idx.items()}
    
    map = [-1] * n
    ptr = Counter()
    now = 0
    odd_used = None
    
    for i, c in enumerate(s):
        odd = idx[c] % 2 == 1
        if odd and odd_used is not None and odd_used != c:
            print(-1)
            return

        p = ptr[c]
        if p < idx[c] // 2:
            map[i] = now
            now += 1
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


# Test case
if __name__ == "__main__":
    input_string = "eel"
    solve(input_string)
```

This Python code translates the Java logic into Python syntax. Note that Python's `Counter` from the `collections` module is used to efficiently handle frequency counts, and Python's list comprehensions and other idiomatic constructs are used as appropriate.

In the provided code, you'll find everything within a `solve` function, except the `bubble_count`, which has been ported as a function that can be called by `solve`. The example also includes a test case section that calls the `solve` function with the test input "eel" to demonstrate the expected output.
