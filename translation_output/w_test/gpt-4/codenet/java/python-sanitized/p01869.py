class Solution:
    def __init__(self):
        self.hash = {}

    def is_all_8(self, d):
        while d > 0:
            if d % 10 != 8:
                return False
            d //= 10
        return True

    def func(self, n):
        if n in self.hash:
            return self.hash[n]

        same = False
        now = n
        res = -1
        max_len = len(str(n))
        for dlen in range(max_len, 0, -1):
            for i in range(1 << dlen):
                d = 0
                ten = 1
                for j in range(dlen):
                    if (i & (1 << j)) == 0:
                        d += ten * 8
                    else:
                        d += ten * 2
                    ten *= 10
                if n == d:
                    same = True
                    continue
                if now < d:
                    continue
                if now % d == 0:
                    res = max(res, self.func(now // d) + self.func(d))

        if same:
            res = max(res, 1)
        elif res == -1:
            res = -100000000

        self.hash[n] = res
        # print(f"{n} {now} {res}")
        return res

    def solve(self, n):
        if n == 1:
            return -1

        res = self.func(n)
        return res if res > -1 else -1


# Test case
test_input = 1
solution = Solution()
print(solution.solve(test_input))  # Expected output: -1