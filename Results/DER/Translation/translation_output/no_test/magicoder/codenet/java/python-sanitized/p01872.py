import sys

class p01872:
    def __init__(self):
        self.s = sys.stdin.readline().strip()

    def solve(self):
        if self.s[-1] == '?':
            sum = 0
            for i in range(len(self.s) - 1):
                n = 11 - i
                q = 0
                p = int(self.s[i])
                if n <= 6 and n >= 1:
                    q = n + 1
                else:
                    q = n - 5
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            print(sum)
        else:
            check = int(self.s[-1])
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(self.s) - 1):
                    n = 11 - i
                    q = 0
                    p = 0
                    if self.s[i] == '?':
                        p = j
                    else:
                        p = int(self.s[i])
                    if n <= 6 and n >= 1:
                        q = n + 1
                    else:
                        q = n - 5
                    sum += q * p
                sum %= 11
                if sum <= 1:
                    sum = 0
                else:
                    sum = 11 - sum
                if check == sum:
                    cnt += 1
                    ans = j
            if cnt == 1:
                print(ans)
            else:
                print("MULTIPLE")

p01872().solve()