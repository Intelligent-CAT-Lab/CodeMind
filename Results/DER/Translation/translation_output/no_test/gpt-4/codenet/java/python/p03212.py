Here is the translated Python code from the provided Java code:

```python
from collections import deque

def add_char(s, location, c):
    return s[:location] + c + s[location:]

def main():
    N = int(input())
    count = 0
    queue = deque(['357', '375', '537', '573', '735', '753'])
    seen = set()
    ch = ['3', '5', '7']

    if N < 1000:
        for s in queue:
            if int(s) <= N:
                count += 1
        print(count)
        return

    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for j in ch:
                    temp = add_char(s, i, j)
                    if temp not in seen:
                        seen.add(temp)
                        queue.append(temp)
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same task as the Java code, setting up a queue and a set to hold permutations of the characters '3', '5', and '7' while maintaining uniqueness as checked by the set. It counts the number of unique permutations that are less than or equal to N. The `add_char` function in the Python code performs similar string manipulation as the `addChar` method in the Java code (`StringBuffer` is analogous to Python's string manipulation capabilities). Note that we use `deque` from the `collections` module in Python as a replacement for `ArrayDeque` in Java for efficient append and pop operations on both ends.
