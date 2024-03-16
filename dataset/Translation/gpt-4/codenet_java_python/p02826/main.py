import sys
from itertools import product

MOD = N = None
table = []

class MyScanner:
    def __init__(self):
        self._current_line = []

    def next(self):
        if not self._current_line:
            self._current_line = sys.stdin.readline().strip().split()
        return self._current_line.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

def main():
    global MOD, N, table
    
    sc = MyScanner()
    N = sc.next_int()
    MOD = sc.next_int()

    table = [[0] * (N + 1) for _ in range(N + 1)]
    for rem in range(N + 1):
        table[N][rem] = rem
    for pos in range(N - 1, 0, -1):
        for rem in range(N+1):
            table[pos][rem] = table[pos + 1][rem]
            factor = min(pos, N + 1 - pos)
            if factor < rem:
                table[pos][rem] += table[pos][rem - factor]
                table[pos][rem] %= MOD
    
    print(table[1][N])

if __name__ == "__main__":
    main()