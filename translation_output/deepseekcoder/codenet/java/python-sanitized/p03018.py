import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.queue = []
        self.space = []
        self.inp = inp

    def read(self):
        if self.space:
            return self.space.pop()
        else:
            raise StopIteration

    def has_next(self):
        while not self.queue:
            line = self.inp.readline()
            if line:
                self.space.extend(line.split())
            else:
                return False
        return True

    def next(self):
        if self.has_next():
            return self.queue.pop()
        else:
            raise StopIteration

    def next_int(self):
        return int(self.next())

    def next_str(self):
        return str(self.next())

    def next_long(self):
        return long(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.inp.readline().rstrip('\n')

def p(element):
    sys.stdout.write(str(element) + "\n")

def pp(element):
    sys.stdout.write(str(element))

def min(a, b, c):
    return min(min(a, b), c)

def max(a, b, c):
    return max(max(a, b), c)

def main():
    sc = FastScanner()
    str = sc.next_str()
    str = str.replace("BC", "X")
    a = 0
    ans = 0
    for i in range(len(str) - 1, -1, -1):
        c = str[i]
        if c == 'X':
            a += 1
        elif c == 'A':
            ans += a
        else:
            a = 0
    p(ans)

if __name__ == "__main__":
    main()