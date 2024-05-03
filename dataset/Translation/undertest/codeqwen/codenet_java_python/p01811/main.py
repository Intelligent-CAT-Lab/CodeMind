import sys

class FastScanner:
    def __init__(self):
        self.inp = sys.stdin.readline

    def next(self):
        return self.inp().strip()

    def next_int(self):
        return int(self.next())

    def next_float(self):
        return float(self.next())

    def next_int_list(self, n):
        return [self.next_int() for _ in range(n)]

    def next_float_list(self, n):
        return [self.next_float() for _ in range(n)]

    def next_str_list(self, n):
        return [self.next() for _ in range(n)]

    def next_int_2d_list(self, n, m):
        return [self.next_int_list(m) for _ in range(n)]

    def next_float_2d_list(self, n, m):
        return [self.next_float_list(m) for _ in range(n)]

    def next_str_2d_list(self, n, m):
        return [self.next_str_list(m) for _ in range(n)]

class Task:
    def solve(self, inp, out):
        S = inp.next()
        while len(S) > 3:
            abc = False
            for i in range(len(S) - 2):
                if S[i:i+3] == "ABC":
                    S = S[:i] + "X" + S[i+3:]
                    abc = True
            if not abc:
                out.write("No\n")
                return
            check = [False] * 3
            for c in S:
                if ord(c) - ord('A') < 3:
                    check[ord(c) - ord('A')] = True
            cnt = sum(check)
            if cnt != 2:
                out.write("No\n")
                return
            for i in range(3):
                if not check[