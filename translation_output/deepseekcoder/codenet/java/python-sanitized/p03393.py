import sys

class p03393:
    def __init__(self):
        self.set = set(chr(i) for i in range(ord('a'), ord('z')+1))

    def solve(self):
        line = sys.stdin.readline().strip()
        for ch in line:
            self.set.remove(ch)
        if self.set:
            print(line + min(self.set))
            return
        if line == 'zyxwvutsrqponmlkjihgfedcba':
            print(-1)
            return
        self.next(line, "")

    def next(self, line, cur):
        if line.startswith(cur) and len(line) > len(cur):
            for ch in sorted(self.set - set(cur)):
                if self.next(line, cur + ch):
                    return True
        elif line == cur:
            if line < cur:
                print(''.join(sorted(cur)))
                return True
        return False

if __name__ == "__main__":
    p03393().solve()