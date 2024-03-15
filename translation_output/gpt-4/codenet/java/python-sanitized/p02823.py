import sys
from functools import reduce

class In:
    def next(self):
        return sys.stdin.readline().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next()) # long in Python 3 is just int

    def next_char_array(self, n, m):
        return [list(self.next()) for _ in range(n)]

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_int_array_op(self, n, op):
        return [op(self.next_int()) for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_long_array_op(self, n, op):
        return [op(self.next_long()) for _ in range(n)]

class Out:
    @staticmethod
    def println(*args):
        print(*args)

    @staticmethod
    def flush():
        sys.stdout.flush()

class p02823:
    mod = 1000000007
    inf = 0xfffffffffffffff

    def solve(self):
        in_ = In()
        out = Out()
        n = in_.next_long()
        a = in_.next_long()
        b = in_.next_long()

        if a > b:
            a, b = b, a
        
        if (b - a) % 2 == 1:
            ans1 = a - 1 + (b - a + 1) // 2
            a = n - a + 1
            b = n - b + 1

            if a > b:
                a, b = b, a
            
            ans2 = a - 1 + (b - a + 1) // 2
            out.println(min(ans1, ans2))
        else:
            out.println((b - a) // 2)

if __name__ == "__main__":
    solver = p02823()
    solver.solve()
    Out.flush()