import math

class p03715:
    def __init__(self):
        self.mod = int(1e9) + 7

    def run(self):
        TEST_CASE = 1
        while TEST_CASE != 0:
            h = int(input())
            w = int(input())
            print(self.dfs(3, float('inf'), float('-inf'), w, h))
            TEST_CASE -= 1

    def dfs(self, d, S1, S2, w, h):
        if w <= 0 or h <= 0:
            return float('inf')
        
        if d == 1:
            return max(S2, w * h) - min(S1, w * h)

        ans = float('inf')
        for i in range(-1, 2):
            dw = w // d + i
            dh = h // d + i
            if dw > 0:
                ans = min(ans, self.dfs(d-1, min(S1, dw * h), max(S2, dw * h), w-dw, h))
            if dh > 0:
                ans = min(ans, self.dfs(d-1, min(S1, w * dh), max(S2, w * dh), w, h-dh))

        return ans

# Initialize and run the program
p = p03715()
p.run()