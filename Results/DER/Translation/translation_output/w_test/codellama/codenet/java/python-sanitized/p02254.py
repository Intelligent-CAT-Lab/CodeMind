import sys

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
    s = sys.stdin.readline().strip()
    frequency = [0] * 26
    for c in s:
        frequency[ord(c) - ord('a')] += 1

    que = []
    map = {}
    for i in range(26):
        tmp = frequency[i]
        if tmp > 0:
            c = chr(ord('a') + i)
            node = Node(c)
            que.append(Pair(node, tmp))
            map[c] = node

    while len(que) > 1:
        p1 = que.pop(0)
        p2 = que.pop(0)
        n1 = p