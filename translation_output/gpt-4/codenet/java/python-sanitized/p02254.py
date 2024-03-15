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

    #