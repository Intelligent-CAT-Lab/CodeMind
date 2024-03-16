from sys import stdin, stdout

class p03393:
    def __init__(self):
        self._intMax = 2147483647  # = Integer.MAX_VALUE
        self._intMin = -2147483648  # = Integer.MIN_VALUE
        self._longMax = 9223372036854775807  # = Long.MAX_VALUE
        self._longMin = -9223372036854775808  # = Long.MIN_VALUE

    def solve(self):
        set_chars = set()
        for ch in range(ord('a'), ord('z')+1):
            set_chars.add(chr(ch))
        
        line = self.readLine()
        for i in range(len(line)):
            ch = line[i]
            set_chars.discard(ch)
        
        if set_chars:
            sb = []
            sb.append(line)
            sb.append(next(iter(set_chars)))
            self.pln(''.join(sb))
            return
        
        if line == "zyxwvutsrqponmlkjihgfedcba":
            self.pln(-1)
            return
        
        self.next(line, "")

    def next(self, line, cur):
        if line[:len(cur)] > cur:
            return False
        
        if len(line) == len(cur):
            if line < cur:
                for i in range(len(line)):
                    self.p(cur[i])
                    if line[i] != cur[i]:
                        break
                self.pln("")
                return True
            else:
                return False
        
        for ch in range(ord('a'), ord('z')+1):
            ch = chr(ch)
            if ch not in cur:
                if self.next(line, cur + ch):
                    return True

        return False

    def abs(self, a):
        return a if a >= 0 else -a

    def max(self, a, b):
        return a if a > b else b

    def min(self, a, b):
        return a if a < b else b

    def pint(self, s):
        return int(s)

    def plong(self, s):
        return int(s)

    def readLine(self):
        return stdin.readline().rstrip()

    def pln(self, val):
        stdout.write(str(val) + '\n')

    def main(self):
        self.solve()

if __name__ == "__main__":
    p = p03393()
    p.main()