class P00378:
    def solve(self):
        A = int(input())
        B = int(input())
        X = int(input())

        if X % 500 != 0:
            X += 500 - X % 500
        a = 0
        b = 0

        if A < B:
            a = X // 1000 + (1 if X % 1000 > 0 else 0)
        elif A > 2 * B:
            b = X // 500
        else:
            a = X // 1000
            X %= 1000
            b = X // 500

        print(A * a + B * b)

if __name__ == "__main__":
    P00378().solve()