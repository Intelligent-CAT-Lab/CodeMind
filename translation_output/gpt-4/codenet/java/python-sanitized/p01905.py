import sys

class p01905:
    def __init__(self):
        self.N, self.M = 0, 0
        self.a = []

    def solve(self):
        self.N = self.next_int()
        self.M = self.next_int()

        self.a = [self.next_int() for _ in range(self.M)]

        b = [True] * (self.N * 2 - 1)
        for i in range(self.M):
            b[self.a[i] + self.N - 1] = False
        
        for i in range(self.N * 2 - 2, 0, -2):
            if b[i] and b[i - 1]:
                b[(i - 2) // 2] = True
            elif b[i] or b[i - 1]:
                b[(i - 2) // 2] = True
            else:
                b[(i - 2) // 2] = False

        ans = sum(1 for i in range(self.N - 1) if b[i * 2 + 1] and b[i * 2 + 2])

        print(ans)

    def next_token(self):
        return input().split()

    def next_int(self):
        return int(next(self.token_gen))

    def main(self):
        self.token_gen = iter(self.next_token())
        self.solve()

if __name__ == '__main__':
    p01905().main()