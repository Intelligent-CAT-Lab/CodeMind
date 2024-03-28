Here is the translation of the provided Java code to Python. It's important to note that Java has built-in classes like `ArrayList`, `ArrayDeque`, and utility methods like `Collections.sort()` that may not have a direct equivalent in Python, so substituting those with Python's list and sorting utilities is necessary.

```python
from collections import deque

class FenwickTree:
    def __init__(self, n):
        self.N = n + 1
        self.data = [0] * (n + 1)

    def add(self, k, val):
        x = k
        while x < self.N:
            self.data[x] += val
            x |= x + 1

    def sum(self, k):
        if k >= self.N:
            k = self.N - 1
        result = 0
        x = k - 1
        while x >= 0:
            result += self.data[x]
            x = (x & (x + 1)) - 1
        return result

    def get(self, k):
        assert 0 <= k < self.N
        return self.sum(k + 1) - self.sum(k)

def solve(S):
    N = len(S)
    pos = [deque() for _ in range(26)]

    for i, char in enumerate(S):
        pos[ord(char) - ord('a')].append(i)

    for p in pos:
        if len(p) % 2 != 0:
            return -1

    prefix_list = []
    suffix_list = []
    for i in range(26):
        s = len(pos[i])
        for j in range(s // 2):
            prefix_list.append((i, pos[i].popleft()))
        for j in range(s // 2):
            suffix_list.append((i, pos[i].popleft()))
    
    prefix_list.sort(key=lambda x: x[1], reverse=True)
    suffix_list.sort(key=lambda x: x[1])

    ans = 0
    for i in range(len(prefix_list)):
        ans += prefix_list[i][1] - i

    prefix = [prefix_list[i][0] for i in range(N // 2)]
    
    for val in suffix_list:
        pos[val[0]].append(val[1])
    suffix = [pos[prefix[i]].popleft() for i in range(N // 2)]

    bit = FenwickTree(N)
    for i in range(N // 2):
        ans += i - bit.sum(suffix[i])
        bit.add(suffix[i], 1)
    return ans

# Normally, you might get input here, but since this is an example, we hardcode it.
input_str = "aabb"
print(solve(input_str))  # Replace with actual input handling code if needed
```

In this Python code, I've made a few assumptions:
- The input is provided as a string to the `solve` function, similar to how the `FastScanner` provides input in Java.
- I have not simulated the `FastScanner` because, in Python, we can simply use the built-in `input()` function or other methods to read from standard input or files directly.
- Instead of `ArrayDeque`, I used Python's `collections.deque`.
- Sorting is done using Python's `list.sort()` method, with a `key` argument for sorting based on a specific element of the tuple.
- I've removed all the class structure, instead created a `FenwickTree` class and a `solve` function directly, which is more idiomatic in Python for this scenario.
- I did not provide an interactive or command-line interface for input/output as it was not included in your question.

This will represent a faithful conversion of the logic while staying idiomatic in Python.
