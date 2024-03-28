class RollingHash:
    def __init__(self, s):
        self.s = s
        self.n = len(s)
        self.base1 = 1007
        self.base2 = 1009
        self.mod1 = 1000000007
        self.mod2 = 1000000009
        self.base1_pow = [1] * (self.n + 1)
        self.base2_pow = [1] * (self.n + 1)
        self.hash1 = [0] * self.n
        self.hash2 = [0] * self.n
        
        for i in range(1, self.n + 1):
            self.base1_pow[i] = (self.base1_pow[i-1] * self.base1) % self.mod1
            self.base2_pow[i] = (self.base2_pow[i-1] * self.base2) % self.mod2
        
        for i in range(self.n):
            self.hash1[i] = ((self.hash1[i-1] if i > 0 else 0) * self.base1 + ord(s[i])) % self.mod1
            self.hash2[i] = ((self.hash2[i-1] if i > 0 else 0) * self.base2 + ord(s[i])) % self.mod2

    def _get_hash(self, hash_list, base_pow, l, r, mod):
        return (hash_list[r] - (hash_list[l-1] * base_pow[r-l+1] if l > 0 else 0) + mod) % mod

    def get_hash1(self, l, r):
        return self._get_hash(self.hash1, self.base1_pow, l, r, self.mod1)

    def get_hash2(self, l, r):
        return self._get_hash(self.hash2, self.base2_pow, l, r, self.mod2)


def solve(s):
    n = len(s)
    rh = RollingHash(s)
    ans = float('inf')
    res = 'mitomerarenaiWA'
    l = r = 0

    for i in range(n):
        t = n - (i + 1) * 3
        if t > 0 and t % 2 == 0:
            a = i + 1
            b = t // 2
            a1 = rh.get_hash2(0, a - 1)
            b1 = rh.get_hash2(a, a + b - 1)
            a2 = rh.get_hash2(a + b, a + b + a - 1)
            b2 = rh.get_hash2(a + b + a, a + b + a + b - 1)
            a3 = rh.get_hash2(a + b + a + b, n - 1)
            if a1 == a2 == a3 and b1 == b2:
                ans = min(ans, i + t)
                l, r = a, b

    if l != 0 and r != 0:
        res = f"Love {s[:l]}{s[l:l+r]}!"

    return res


# Test case
test_input = "NicoNicoNi"
expected_output = "5o^_ ico!"
output = solve(test_input)
print(output)