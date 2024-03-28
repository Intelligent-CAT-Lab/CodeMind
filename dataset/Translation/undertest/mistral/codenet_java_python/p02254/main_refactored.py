class main:
    import heapq
    
    class Node:
        def __init__(self, char):
            self.char = char
            self.parent = None
            self.depth = 0
    
    class Pair:
        def __init__(self, node, freq):
            self.node = node
            self.freq = freq
    
        def __lt__(self, other):
            return self.freq < other.freq
    
    def depth(node):
        if node is None:
            return 0
        return node.depth + 1
    
    def p02254():
        s = input()
        freq = [0] * 26
        for i in range(len(s)):
            freq[ord(s[i]) - 'a'] += 1
    
        heap = [Pair(node, freq[i]) for i, node in enumerate(Node(c) for c in s)]
        map = {chr(i): node for i, node in enumerate(Node(c) for c in s)}
    
        while len(heap) > 1:
            p1 = heapq.heappop(heap)
            p2 = heapq.heappop(heap)
            node1 = p