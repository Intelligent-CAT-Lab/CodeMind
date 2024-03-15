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


def main():
    s = input()
    frequency = [0] * 26
    for i in range(len(s)):
        frequency[ord(s[i]) - 'a'] += 1

    heap = [Pair(Node(c), freq) for c, freq in zip('abcdefghijklmnopqrstuvwxyz'.split(), frequency)]
    map = {c: Node(c) for c in 'abcdefghijklmnopqrstuvwxyz'}

    while len(heap) > 1:
        p1, p2 = heapq.heappop(heap)
        n1, n2 = p