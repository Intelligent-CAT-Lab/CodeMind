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
    for char in s:
        frequency[ord(char) - ord('a')] += 1

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
        n1, n2 = p1.node, p2.node

        parent = Node('.')
        n1.parent = parent
        n2.parent = parent
        new_freq = p1.frequency + p2.frequency
        heapq.heappush(que, Pair(parent, new_freq))

    res = 0
    for i in range(26):
        tmp = frequency[i]
        if tmp > 0:
            c = chr(ord('a') + i)
            res += tmp * map[c].depth()

    print(res if len(map) > 1 else len(s))

if __name__ == "__main__":
    main()
```
```
