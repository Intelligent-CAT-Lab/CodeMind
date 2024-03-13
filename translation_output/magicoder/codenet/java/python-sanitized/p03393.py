import sys

class p03393:
    def __init__(self):
        self._intMax = sys.maxsize
        self._intMin = -sys.maxsize - 1
        self._longMax = sys.maxsize
        self._longMin = -sys.maxsize - 1

    def solve(self):
        set_ = set(chr(i) for i in range(ord('a'), ord('z') + 1))
        line = self.readLine()
        for ch in line:
            set_.discard(ch)
        if set_:
            print(line + min(set_))
            return
        if line == 'zyxwvutsrqponmlkjihgfedcba':
            print(-1)
            return
        self.next(line, "")

    def next(self, line, cur):
        if line.startswith(cur):
            return False
        if len(line) == len(cur):
            if line < cur:
                for i in range(len(line)):
                    print(cur[i], end='')
                    if line[i] != cur[i]:
                        break
                print()
                return True
            else:
                return False
        for ch in map(chr, range(ord('a'), ord('z') + 1)):
            if ch not in cur:
                if self.next(line, cur + ch):
                    return True
        return False

    # -----------------------------------------------------
    # 2018/04/26 r2
    # -----------------------------------------------------
    def abs(self, a):
        return abs(a)

    def max(self, a, b):
        return max(a, b)

    def min(self, a, b):
        return min(a, b)

    def pint(self, s):
        return int(s)

    def plong(