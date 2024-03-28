class main:
    import string
    
    def count_chars(s):
        count = [0] * 26
        countnum = [0] * 10
        for c in s:
            if c.isalpha():
                count[string.ascii_lowercase.index(c)] += 1
            elif c.isdigit():
                countnum[int(c)] += 1
        return count, countnum
    
    def solve(s):
        count, countnum = count_chars(s)
        ans = 0
        for i in range(26, 3, -1):
            for j in range(26 - i + 1):
                tmp = 10000
                for k in range(j, j + i):
                    tmp = min(tmp, count[k])
                ans += tmp * 3
                for k in range(j, j + i):
                    count[k] -= tmp
        for i in range(26):
            ans += count[i]
        for i in range(10, 3, -1):
            for j in range(10 - i + 1):
                tmp = 10000
                for k in range(j, j + i):
                    tmp = min(tmp, countnum[k])
                ans += tmp * 3
                for k in range(j, j + i):
                    countnum[k] -= tmp
        for i in range(10):
            ans += countnum[i]
        return ans
    
    s = "0ig3he12fz99"
    print(solve(s)) # Output: 9