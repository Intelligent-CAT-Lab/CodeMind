import sys
from functools import lru_cache

class Modular:
    def __init__(self, m):
        self.m = int(m)
    
    def value_of(self, x):
        x %= self.m
        if x < 0:
            x += self.m
        return x
    
    def mul(self, x, y):
        return self.value_of(x * y)
    
    def add(self, x, y):
        return self.value_of(x + y)

class TaskC:
    def __init__(self, n, mod):
        self.f = [-1] * (n + 1)
        self.suffix = [-1] * (n + 1)
        self.n = n
        self.mod = mod
        self.f[n] = n
        self.suffix[n] = n
    
    @lru_cache(maxsize=None)
    def f(self, i):
        if i > self.n:
            return 0
        if self.f[i] == -1:
            self.f[i] = self.f(i + 1)
            if i + 3 <= self.n:
                since = i + 3
                until = self.n - i - 1
                self.f[i] = self.mod.add(self.f[i], self.suffix(since))
                self.f[i] = self.mod.add(self.f[i], self.n - until)
                self.f[i] = self.mod.add(self.f[i], self.mod.mul(self.n - 1, self.n - 1))
            else:
                self.f[i] = self.mod.add(self.f[i], self.mod.mul(self.n - 1, self.n))
        return self.f[i]
    
    @lru_cache(maxsize=None)
    def suffix(self, i):
        if i > self.n:
            return 0
        if self.suffix[i] == -1:
            self.suffix[i] = self.mod.add(self.f(i), self.suffix(i + 1))
        return self.suffix[i]

def read_ints():
    return list(map(int, sys.stdin.readline().split()))

def main():
    n = read_ints()[0]
    mod = Modular(1e9 + 7)
    task = TaskC(n, mod)
    ans = task.f(1)
    print(ans)

if __name__ == '__main__':
    sys.setrecursionlimit(1 << 30)
    main()