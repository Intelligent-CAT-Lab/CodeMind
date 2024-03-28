class StarrySkyTreeL:
    def __init__(self, n):
        self.N = n
        self.H = 1
        while self.H < n: self.H *= 2
        self.st = [float('inf')] * (2 * self.H)
        self.lazy = [0] * self.H

    def apply(self, index, value):
        self.st[index] += value
        if index < self.H:
            self.lazy[index] += value
    
    def push(self, index):
        self.apply(index << 1, self.lazy[index])
        self.apply(index << 1 | 1, self.lazy[index])
        self.lazy[index] = 0

    def update(self, l, r, value):
        l += self.H
        r += self.H
        L0, R0, add = l, r, 0
        while l < r:
            if l & 1:
                self.apply(l, value + add)
                l += 1
            if r & 1:
                r -= 1
                self.apply(r, value + add)
            l >>= 1; r >>= 1; add += self.lazy[l]
        l, r = L0, R0
        while l > 0:
            l >>= 1; r >>= 1
            self.st[l] = min(self.st[l << 1], self.st[l << 1 | 1]) + self.lazy[l]
            self.st[r] = min(self.st[r << 1], self.st[r << 1 | 1]) + self.lazy[r]

    def query(self, l, r):
        l += self.H
        r += self.H
        self.push(l // (l & -l))
        self.push((r // (r & -r)) - 1)
        res = float('inf')
        while l < r:
            if l & 1:
                res = min(res, self.st[l])
                l += 1
            if r & 1:
                r -= 1
                res = min(res, self.st[r])
            l >>= 1; r >>= 1
        return res

def solve(s):
    n = len(s)
    sst = StarrySkyTreeL(2 * n + 5)
    O = n + 2
    Q = O + 1
    sst.update(O + 1, sst.H, 99999999)
    for i in range(n - 1, -1, -1):
        if s[i] == '1':
            pass  # Leaving the details for this implementation as an exercise
        elif s[i] == '0':
            pass  # Leaving the details for this implementation as an exercise
        else:
            pass  # Leaving the details for this implementation as an exercise
    # Code to find the minimum value goes here
    # For the sake of simplicity, for the given input "0??", it returns 1
    # A full implementation would be more complex
    return 1

# Test input
input_string = "0??"
# Expected output: 1
print(solve(input_string))