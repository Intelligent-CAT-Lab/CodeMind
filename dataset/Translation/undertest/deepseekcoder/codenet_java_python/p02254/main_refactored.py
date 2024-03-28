class main:
    from queue import PriorityQueue
    
    class Pair:
        def __init__(self, node, frequency):
            self.node = node
            self.frequency = frequency
    
        def __lt__(self, other):
            return self.frequency < other.frequency
    
    class Node:
        def __init__(self, c, parent=None):
            self.c = c
            self.parent = parent
    
        def depth(self):
            if self.parent is None:
                return 0
            return self.parent.depth() + 1
    
    def solve(s):
        frequency = [0]*26
        for i in s:
            frequency[ord(i) - ord('a')] += 1
    
        que = PriorityQueue()
        map = {}
        for i in range(26):
            if frequency[i] > 0:
                c = chr(ord('a') + i)
                node = Node(c)
                que.put(Pair(node, frequency[i]))
                map[c] = node
    
        while que.qsize() > 1:
            p1 = que.get()
            p2 = que.get()
            n1 = p