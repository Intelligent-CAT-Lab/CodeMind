Here's the translated Python code that replicates the functionality of the provided Java code:

```python
import heapq

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
    s = input()
    frequency = [0] * 26
    for ch in s:
        frequency[ord(ch) - ord('a')] += 1

    que = []
    node_map = {}
    for i, freq in enumerate(frequency):
        if freq > 0:
            c = chr(ord('a') + i)
            node = Node(c)
            heapq.heappush(que, Pair(node, freq))
            node_map[c] = node

    while len(que) > 1:
        p1 = heapq.heappop(que)
        p2 = heapq.heappop(que)
        parent = Node('.')
        p1.node.parent = parent
        p2.node.parent = parent
        new_freq = p1.frequency + p2.frequency
        heapq.heappush(que, Pair(parent, new_freq))

    res = sum(frequency[i] * node_map[chr(ord('a') + i)].depth() for i in range(26) if frequency[i] > 0)

    print(res if len(node_map) > 1 else len(s))

if __name__ == '__main__':
    main()
```

This Python code follows a similar structure to the Java code, using a priority queue (heapq in Python) to manage the pairs and a custom Node and Pair class. Note that in Python, the `__lt__` method is defined to create a comparable object, which allows the `heapq` functions to properly order the Pair instances. The main logic in processing the string and building the Huffman Tree represented by Node objects with their respective depths is preserved in the translation from Java to Python.
