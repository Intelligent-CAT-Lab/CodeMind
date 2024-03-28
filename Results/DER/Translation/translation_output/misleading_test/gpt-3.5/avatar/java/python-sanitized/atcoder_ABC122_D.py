class AtCoder_ABC122_D:
    def __init__(self):
        self.N = int(input())
        self.MOD = 1000000007
        self.TOKENS = ["A", "C", "G", "T"]
        self.memo = [{} for _ in range(self.N + 1)]

    def is_ok(self, last_4):
        if "AGC" in last_4:
            return False
        for i in range(3):
            vals = list(last_4)
            vals[i], vals[i + 1] = vals[i + 1], vals[i]
            s = "".join(vals)
            if "AGC" in s:
                return False
        return True

    def dfs(self, current, last_3):
        if last_3 in self.memo[current]:
            return self.memo[current][last_3]
        if current == self.N:
            return 1
        result = 0
        for c in self.TOKENS:
            if self.is_ok(last_3 + c):
                result = (result + self.dfs(current + 1, last_3[1:] + c)) % self.MOD
        self.memo[current][last_3] = result
        return result

    def calc(self):
        return self.dfs(0, "TTT")

if __name__ == "__main__":
    atcoder = AtCoder_ABC122_D()
    print(atcoder.calc())