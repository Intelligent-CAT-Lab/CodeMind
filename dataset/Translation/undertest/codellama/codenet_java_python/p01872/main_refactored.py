class main:
    import sys
    
    def solve():
        s = sys.stdin.readline().strip()
        if s[-1] == '?':
            sum = 0
            for i in range(len(s) - 1):
                n = 11 - i
                q = 0
                p = int(s[i])
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
            check = int(s[-1])
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(s) - 1):
                    n = 11 - i
                    q = 0
                    p = 0
                    if s[i] == '?':
                        p = j
                    else:
                        p = int(s[i])
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
    
    if __name__ == "__main__":
        solve()