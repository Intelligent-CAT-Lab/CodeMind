from queue import PriorityQueue

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
        else:
            return self.parent.depth() + 1

def main():
    s = input()
    frequency = [0] * 26
    for c in s:
        frequency[ord(c) - ord('a')] += 1

    que = PriorityQueue()
    map = {}
    for i in range(26):
        tmp = frequency[i]
        if tmp > 0:
            c = chr(ord('a') + i)
            node = Node(c)
            que.put(Pair(node, tmp))
            map[c] = node

    while que.qsize() > 1:
        p1 = que.get()
        p2 = que.get()
        n1 = p