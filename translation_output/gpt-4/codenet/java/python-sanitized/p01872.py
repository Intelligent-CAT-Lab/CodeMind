import sys

class p01872:
    def solve(self):
        s = self.next()
        if s.endswith('?'):
            sum = 0
            for i in range(len(s) - 1):
                n = 11 - i
                if 1 <= n <= 6:
                    q = n + 1
                else:  # if 7 <= n <= 11
                    q = n - 5
                p = int(s[i])  # convert char to int
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            print(sum)
        else:
            check = int(s[-1])  # Last character as an integer
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(s) - 1):
                    n = 11 - i
                    if 1 <= n <= 6:
                        q = n + 1
                    else:  # if 7 <= n <= 11
                        q = n - 5
                    p = j if s[i] == '?' else int(s[i])
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

    def next(self):
        return input()

if __name__ == "__main__":
    solver = p01872()
    solver.solve()