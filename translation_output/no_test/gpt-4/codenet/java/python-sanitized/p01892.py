import sys

class p01892:
    def solve(self):
        self.A = int(input())
        self.B = int(input())
        self.N = int(input())

        ans = abs(self.A - self.B)
        for i in range(1, self.N + 1):
            for j in range(1, self.N + 1):
                if i * self.B % j != 0:
                    continue
                ans = min(ans, abs(self.A - i * self.B // j))

        print(ans)

if __name__ == "__main__":
    problem = p01892()
    problem.solve()