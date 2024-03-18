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
        p