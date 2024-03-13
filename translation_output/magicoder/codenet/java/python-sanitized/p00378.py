import sys

class p00378:
    def solve(self):
        A, B, X = map(int, sys.stdin.readline().split())

        if X % 500 != 0: X += 500 - X % 500
        a = b = 0

        if A < B:
            a = X // 1000 + ((X % 1000 > 0) * 1)
        elif A > 2 * B:
            b = X // 500
        else:
            a = X // 1000
            X %= 1000
            b = X // 500

        print(A * a + B * b)

p00378().solve()