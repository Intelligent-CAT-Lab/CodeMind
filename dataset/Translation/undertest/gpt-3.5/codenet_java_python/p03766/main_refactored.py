class main:
    class TaskC:
        def solve(self, in_data):
            n = int(in_data)
            f = [-1] * (n + 1)
            suffix = [-1] * (n + 1)
            f[n] = n
            suffix[n] = n
    
            ans = self.f(1, n, f, suffix)
            return ans
    
        def f(self, i, n, f, suffix):
            mod = 10**9 + 7
            if i > n:
                return 0
    
            if f[i] == -1:
                f[i] = self.f(i + 1, n, f, suffix)
                if i + 3 <= n:
                    since = i + 3
                    until = n - i - 1
                    f[i] = (f[i] + self.suffix(since, n, f)) % mod
                    f[i] = (f[i] + n - until) % mod
                    f[i] = (f[i] + (n - 1) * (n - 1)) % mod
                else:
                    f[i] = (f[i] + (n - 1) * n) % mod
    
            return f[i]
    
        def suffix(self, i, n, f):
            mod = 10**9 + 7
            if i > n:
                return 0
    
            if f[i] == -1:
                f[i] = (f[i] + self.suffix(i + 1, n, f)) % mod
    
            return f[i]
    
    def main():
        in_data = input()
        solver = TaskC()
        ans = solver.solve(int(in_data))
        print(ans)
    
    if __name__ == "__main__":
        main()