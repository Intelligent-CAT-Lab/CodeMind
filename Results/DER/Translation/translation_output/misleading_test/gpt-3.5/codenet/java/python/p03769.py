```python
from collections import deque

def permutation_whose_number_of_increasing_sequence_is_k(K):
    cur = (K + 1).bit_length() - 1
    perm = []
    for i in range(cur):
        perm.append(i)
    p = cur
    for d in range(cur - 1, -1, -1):
        x = 1 << d
        if cur + x <= K:
            cur += x
            perm.insert(d, p)
            p += 1
    return perm

def solve():
    n = int(input())
    perm = permutation_whose_number_of_increasing_sequence_is_k(n)
    print(len(perm)*2)
    for i in range(1, len(perm) + 1):
        if i > 1:
            print(" ", end="")
        print(i, end="")
    for val in perm:
        print(" ", val + 1, end="")
    print()

if __name__ == "__main__":
    solve()
```
This Python code translates the given Java code to Python and solves the provided test case.
