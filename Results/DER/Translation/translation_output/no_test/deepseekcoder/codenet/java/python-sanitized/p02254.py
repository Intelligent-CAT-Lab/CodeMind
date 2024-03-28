import heapq
import sys
from collections import defaultdict

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

def huffman_coding(s):
    frequency = [0]*26
    for i in s:
        frequency[ord(i) - ord('a')] += 1

    que = []
    map = {}
    for i in range(26):
        if frequency[i] > 0:
            c = chr(ord('a') + i)
            node = Node(c)
            heapq.heappush(que, Pair(node, frequency[i]))
            map[c] = node

    while len(que) > 1:
        p1 = heapq.heappop(que)
        p2 = heapq.heappop(que)
        n1 = p