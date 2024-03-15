class p00378:
    def solve(self):
        A, B, X, ans = 0, 0, 0, 0
        A = int(input())
        B = int(input())
        X = int(input())

        if X % 500 != 0:
            X += 500 - X%500
        a, b = 0, 0

        if A < B:
            a = X // 1000 + 1 if X % 1000 > 0 else 0
        elif A > 2*B:
            b = X // 500
        else:
            a = X // 1000
            X %= 1000
            b = X // 500

        print(A*a + B*b)

p = p00378()
p.solve()