class Modular:
    def __init__(self, m):
        self.m = m

    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x

    def mul(self, x, y):
        return self.value_of(x * y)

    def plus(self, x, y):
        return self.value_of(x + y)

class TaskC:
    def __init__(self, mod):
        self.mod = mod
        self.f = None
        self.suffix = None
        self.n = 0

    def solve(self, n):
        self.n = n
        self.f = [-1] * (n + 1)
        self.suffix = [-1] * (n + 1)
        self.f[n] = n
        self.suffix[n] = n

        ans = self.f_recursive(1)
        return ans

    def f_recursive(self, i):
        if i > self.n:
            return 0
        if self.f[i] == -1:
            self.f[i] = self.f_recursive(i + 1)
            if i + 3 <= self.n:
                since = i + 3
                until = self.n - i - 1
                self.f[i] = self.mod.plus(self.f[i], self.suffix_recursive(since))
                self.f[i] = self.mod.plus(self.f[i], self.n - until)
                self.f[i] = self.mod.plus(self.f[i], self.mod.mul(self.n - 1, self.n - 1))
            else:
                self.f[i] = self.mod.plus(self.f[i], self.mod.mul(self.n - 1, self.n))
        return self.f[i]

    def suffix_recursive(self, i):
        if i > self.n:
            return 0
        if self.suffix[i] == -1:
            self.suffix[i] = self.mod.plus(self.f_recursive(i), self.suffix_recursive(i + 1))
        return self.suffix[i]

def main():
    n = int(input())
    MOD = 10**9 + 7
    task = TaskC(Modular(MOD))
    ans = task.solve(n)
    print(ans)

if __name__ == "__main__":
    main()