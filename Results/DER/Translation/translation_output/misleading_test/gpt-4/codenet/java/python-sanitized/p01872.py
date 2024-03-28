def solve():
    s = input()
    if s[-1] == '?':
        sum_ = 0
        for i in range(len(s) - 1):
            n = 11 - i
            if 1 <= n <= 6:
                q = n + 1
            else:  # if 7 <= n <= 11
                q = n - 5
            p = int(s[i])
            sum_ += q * p
        sum_ %= 11
        if sum_ <= 1:
            sum_ = 0
        else:
            sum_ = 11 - sum_
        print(sum_)
    else:
        check = int(s[-1])
        cnt = 0
        ans = 0
        for j in range(10):
            sum_ = 0
            for i in range(len(s) - 1):
                n = 11 - i
                if s[i] == '?':
                    p = j
                else:
                    p = int(s[i])
                if 1 <= n <= 6:
                    q = n + 1
                else:  # if 7 <= n <= 11
                    q = n - 5
                sum_ += q * p
            sum_ %= 11
            if sum_ <= 1:
                sum_ = 0
            else:
                sum_ = 11 - sum_
            if check == sum_:
                cnt += 1
                ans = j
        if cnt == 1:
            print(ans)
        else:
            print("MULTIPLE")


# Main execution
solve()