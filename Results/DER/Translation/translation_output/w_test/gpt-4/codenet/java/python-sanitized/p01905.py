class Problem01905:
    def __init__(self):
        self.N, self.M = map(int, input().split())
        self.a = [0] * self.N

        for i in range(self.M):
            self.a[i] = int(input())

        b = [True] * (self.N * 2 - 1)
        for i in range(self.M):
            b[self.a[i] + self.N - 1] = False

        for i in range(self.N * 2 - 2, 0, -2):
            b[(i - 2) // 2] = b[i] and b[i - 1] or b[i] or b[i - 1]

        ans = 0
        for i in range(self.N - 1):
            if b[i * 2 + 1] and b[i * 2 + 2]:
                ans += 1

        print(ans)


if __name__ == "__main__":
    Problem01905()