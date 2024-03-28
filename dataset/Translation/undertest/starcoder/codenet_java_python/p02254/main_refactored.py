class main:
    import sys
    import heapq
    
    class Node:
        def __init__(self, c):
            self.c = c
            self.parent = None
    
        def depth(self):
            if self.parent == None:
                return 0
            return self.parent.depth() + 1
    
    class Pair:
        def __init__(self, node, frequency):
            self.node = node
            self.frequency = frequency
    
        def __lt__(self, other):
            return self.frequency > other.frequency
    
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
                heapq.heappush(que, Pair(node, tmp))
                map[c] = node
    
        while len(que) > 1:
            p1 = heapq.heappop(que)
            p2 = heapq.heappop(que)
            n1 = p