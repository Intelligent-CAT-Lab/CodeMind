import sys

class In:
    def next(self):
        return input().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_char_array(self, n, m):
        return [list(self.next()) for _ in range(n)]

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

class Out:
    def println(self, *args):
        print(*args)

    def flush(self):
        sys.stdout.flush()

class p03840:
    def __init__(self):
        self.in_ = In()
        self.out = Out()

    def solve(self):
        ai = self.in_.next_int()
        ao = self.in_.next_int()
        at = self.in_.next_int()
        aj = self.in_.next_int()
        al = self.in_.next_int()
        as_ = self.in_.next_int()
        az = self.in_.next_int()
        ans = 0
        ans += ao
        if (ai % 2 + aj % 2 + al % 2) == 3:
            ans += ai + aj + al
        elif (ai % 2 + aj % 2 + al % 2) == 2:
            if ai != 0 and aj != 0 and al != 0:
                ans += ai + aj + al - 1
            else:
                ans += ai + aj + al - 2
        elif (ai % 2 + aj % 2 + al % 2) == 1:
            ans += ai + aj + al - 1
        else:
            ans += ai + aj + al
        self.out.println(ans)

if __name__ == '__main__':
    solver = p03840()
    solver.solve()
    solver.out.flush()