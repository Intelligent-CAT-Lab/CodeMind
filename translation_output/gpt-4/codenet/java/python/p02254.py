Below is the translated version of the provided Java code into Python, using standard Python libraries and object-oriented principles:

```python
import heapq
from collections import defaultdict

class Pair:
    def __init__(self, node, frequency):
        self.node = node
        self.frequency = frequency

    def __lt__(self, other):
        return self.frequency < other.frequency

class Node:
    def __init__(self, c):
        self.c = c
        self.parent = None

    def depth(self):
        if self.parent is None:
            return 0
        return self.parent.depth() + 1

def main():
    # Instead of using Scanner, we use input() in Python
    s = input()

    # Using defaultdict to store frequencies ensures no KeyError
    frequency = defaultdict(int)
    for c in s:
        frequency[c] += 1

    # The priority queue in Python can be used using heapq module
    que = []
    map = {}
    for c, freq in frequency.items():
        node = Node(c)
        heapq.heappush(que, Pair(node, freq))
        map[c] = node

    while len(que) > 1:
        p1 = heapq.heappop(que)
        p2 = heapq.heappop(que)

        parent = Node('.')
        p1.node.parent = parent
        p2.node.parent = parent
        new_freq = p1.frequency + p2.frequency
        heapq.heappush(que, Pair(parent, new_freq))

    # Calculate the total depth times frequency for each character
    res = sum(freq * map[c].depth() for c, freq in frequency.items())

    # Printing results
    print(res if len(map) > 1 else len(s))

# This is the standard boilerplate that calls the main() function.
if __name__ == '__main__':
    main()
```
Please note the following differences between the Java and Python code:

1. In the Python version, the `main()` function replaces the `public static void main` in Java.
2. Python doesn't have built-in priority queues with comparable interface. Instead, we use the `heapq` module, which is a binary heap implementation usually used for priority queues in Python.
3. User input is obtained with `input()` instead of a `Scanner` object.
4. The Python code does not use indices to refer to characters. Instead, it iterates directly over characters.
5. Python's print function is used instead of System.out.println.

Make sure to adjust the input part as per the environment requirement, because unlike in the Java code, here we assume that the whole input string is ready to be read from the standard input without any prompt.
