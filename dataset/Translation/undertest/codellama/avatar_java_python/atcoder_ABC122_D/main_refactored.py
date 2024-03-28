class main:
    import sys
    
    class AtcoderABC122D:
        def __init__(self, N):
            self.N = N
            self.MOD = 1000000007
            self.TOKENS = ["A", "C", "G", "T"]
            self.memo = [{} for _ in range(N + 1)]
    
        def calc(self):
            return self.dfs(0, "TTT")
    
        def is_ok(self, last4):
            if "AGC" in last4:
                return False
            for i in range(3):
                vals = list(last4)
                vals[i], vals[i + 1] = vals[i + 1], vals[i]
                s = "".join(vals)
                if "AGC" in s:
                    return False
            return True
    
        def dfs(self, current, last3):
            if last3 in self.memo[current]:
                return self.memo[current][last3]
            if current == self.N:
                return 1
            result = 0
            for c in self.TOKENS:
                if self.is_ok(last3 + c):
                    result = (result + self.dfs(current + 1, last3[1:] + c)) % self.MOD
            self.memo[current][last3] = result
            return result
    
    if __name__ == "__main__":
        N = int(sys.stdin.readline())
        ins = AtcoderABC122D(N)
        print(ins.calc())