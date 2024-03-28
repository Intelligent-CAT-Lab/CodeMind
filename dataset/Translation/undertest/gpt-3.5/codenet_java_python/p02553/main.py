import sys

class FastScanner:
    def __init__(self, source):
        self.inp = source.read().split()
        self.ptr = 0

    def has_next(self):
        return self.ptr < len(self.inp)

    def next_long(self):
        if self.has_next():
            val = int(self.inp[self.ptr])
            self.ptr += 1
            return val
        else:
            raise Exception('No more tokens available.')

def solve_abc178_b():
    sc = FastScanner(sys.stdin)
    a, b, c, d = sc.next_long(), sc.next_long(), sc.next_long(), sc.next_long()
    
    ans = a * c
    ans = max(ans, a * d)
    ans = max(ans, b * c)
    ans = max(ans, b * d)
    
    print(ans)

if __name__ == "__main__":
    solve_abc178_b()