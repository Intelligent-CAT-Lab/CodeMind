class main:
    import sys
    
    class p03393:
        def __init__(self):
            self._intMax = sys.maxsize
            self._intMin = -sys.maxsize
            self._longMax = sys.maxsize
            self._longMin = -sys.maxsize
    
        def solve(self):
            set = set()
            for ch in range(ord('a'), ord('z') + 1):
                set.add(chr(ch))
            line = sys.stdin.readline().strip()
            for i in range(len(line)):
                ch = line[i]
                set.remove(ch)
            if len(set) > 0:
                print(line + set.pop())
                return
            if line == "zyxwvutsrqponmlkjihgfedcba":
                print(-1)
                return
            self.next(line, "")
    
        def next(self, line, cur):
            if line[:len(cur)] > cur:
                return False
            if len(line) == len(cur):