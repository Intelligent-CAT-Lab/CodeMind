class Mod:
    def __init__(self, m):
        self.mod = m

    def add(self, x, y):
        return (x + y) % self.mod

    def sub(self, x, y):
        return (x - y) % self.mod

    def mul(self, x, y):
        return (x * y) % self.mod

    def pow(self, x, y):
        return pow(x, y, self.mod)

    def inv(self, x):
        return pow(x, self.mod - 2, self.mod)

    def div(self, x, y):
        return self.mul(x, self.inv(y))

    def fact(self, x):
        result = 1
        for i in range(1, x + 1):
            result = self.mul(result, i)
        return result

    def inv_fact(self, x):
        result = 1
        for i in range(x, 0, -1):
            result = self.mul(result, self.inv(i))
        return result


def solve():
    global mod
    n, k = map(int, input().split())
    mod = Mod(1000000007)
    for i in range(1, k + 1):
        bl = mod.div(mod.fact(k - 1), mod.mul(mod.fact(i - 1), mod.fact(k - i)))
        re = mod.div(mod.fact(n - k + 1), mod.mul(mod.fact(i), mod.fact(n - k - i + 1)))
        print(mod.mul(bl, re))

# Assuming the solve function will be called with correct input format
solve()