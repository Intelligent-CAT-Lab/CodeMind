class Solution:
    def solve(self):
        L, R = map(int, input().split())

        R -= L
        L %= 2019
        R += L

        res = 2019  # max value

        if R - L > 2019:
            print(0)
            return

        for i in range(L, R + 1):
            for j in range(L, i):
                res = min(res, (i * j) % 2019)

        print(res)


if __name__ == "__main__":
    ob = Solution()
    ob.solve()