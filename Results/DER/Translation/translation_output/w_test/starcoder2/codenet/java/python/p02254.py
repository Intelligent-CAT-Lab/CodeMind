

```python
import heapq

class Node:
    def __init__(self, c):
        self.c = c
        self.parent = None

    def depth(self):
        if self.parent is None:
            return 0
        return self.parent.depth() + 1

class Pair:
    def __init__(self, node, frequency):
        self.node = node
        self.frequency = frequency

    def __lt__(self, other):
        return self.frequency < other.frequency

s = input()
frequency = [0] * 26
for i in range(len(s)):
    frequency[ord(s[i]) - ord('a')] += 1

que = []
map = {}
for i in range(26):
    tmp = frequency[i]
    if tmp > 0:
        c = chr(ord('a') + i)
        node = Node(c)
        heapq.heappush(que, Pair(node, tmp))
        map[c] = node

while len(que) > 1:
    p1 = heapq.heappop(que)
    p2 = heapq.heappop(que)
    n1 = p1.node
    n2 = p2.node

    parent = Node('.')
    n1.parent = parent
    n2.parent = parent
    newFreq = p1.frequency + p2.frequency
    heapq.heappush(que, Pair(parent, newFreq))

res = 0
for i in range(26):
    tmp = frequency[i]
    if tmp > 0:
        c = chr(ord('a') + i)
        res += tmp * (map[c].depth())

print(res if len(map) > 1 else len(s))
```
/p02254.py
import heapq

class Node:
    def __init__(self, c):
        self.c = c
        self.parent = None

    def depth(self):
        if self.parent is None:
            return 0
        return self.parent.depth() + 1

class Pair:
    def __init__(self, node, frequency):
        self.node = node
        self.frequency = frequenque, Pair(node, tmp))
        map[c] = node

while len(que) > 1:
    p1 = heapq.heappop(que)
    p2 = heapq.heappop(que)
    n1 = p1.node
    n2 = p2.node

    parent = Node('.')
    n1.parent = parent
    n2.parent = parent
    newFreq = p1.frequency + p2.frequency
    heapq.heappush(que, Pair(parent, newFreq))

res = 0
for i in range(26):
    tmp = frequency[i]
    if tmp > 0:
        c = chr(ord('a') + i)
        res += tmp * (map[c].depth())

print(res if len(map) > 1 else len(s))
cy

    def __lt__(self, other):
        return self.frequency < other.frequency

s = input()
frequency = [0] * 26
for i in range(len(s)):
    frequency[ord(s[i]) - ord('a')] += 1

que = []
map = {}
for i in range(26):
    tmp = frequency[i]
    if tmp > 0:
        c = chr(ord('a') + i)
        node = Node(c)
        heapq.heappush(
