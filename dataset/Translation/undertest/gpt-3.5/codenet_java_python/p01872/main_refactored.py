class main:
    import sys
    
    class p01872:
        def solve(self):
            s = self.next()
            if s[-1] == '?':
                s = s[:-1]
                sum_val = 0
                for i in range(len(s)):
                    n = 11 - i
                    q = 0
                    p = int(s[i])
                    if 1 <= n <= 6:
                        q = n + 1
                    else:
                        q = n - 5
                    sum_val += q * p
                sum_val %= 11
                if sum_val <= 1:
                    sum_val = 0
                else:
                    sum_val = 11 - sum_val
                print(sum_val)
            else:
                check = int(s[-1])
                cnt = 0
                ans = 0
                for j in range(10):
                    sum_val = 0
                    for i in range(len(s) - 1):
                        n = 11 - i
                        q = 0
                        if s[i] == '?':
                            p = j
                        else:
                            p = int(s[i])
                        if 1 <= n <= 6:
                            q = n + 1
                        else:
                            q = n - 5
                        sum_val += q * p
                    sum_val %= 11
                    if sum_val <= 1:
                        sum_val = 0
                    else:
                        sum_val = 11 - sum_val
                    if check == sum_val:
                        cnt += 1
                        ans = j
                if cnt == 1:
                    print(ans)
                else:
                    print("MULTIPLE")
    
        def next(self):
            s = sys.stdin.readline().strip()
            return s
    
    if __name__ == "__main__":
        sys.stdout.flush()
        p01872().solve()