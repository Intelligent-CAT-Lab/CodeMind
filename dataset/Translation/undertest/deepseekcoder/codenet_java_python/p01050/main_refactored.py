class main:
    def solve(s):
        sd = "abcdefghijklmnopqrstuvwxyz"
        sdnum = "0123456789"
    
        count = [0]*26
        countnum = [0]*10
    
        for i in s:
            if i in sdnum:
                countnum[int(i)] += 1
            if i in sd:
                count[sd.index(i)] += 1
    
        ans = 0
        for i in range(26, 2, -1):
            for j in range(0, 26-i+1):
                tmp = 10000
                for k in range(j, j+i):
                    tmp = min(tmp, count[k])
                ans += tmp * 3
                for k in range(j, j+i):
                    count[k] -= tmp
                    
        ans += sum(count)
    
        for i in range(10, 2, -1):
            for j in range(0, 10-i+1):
                tmp = 10000
                for k in range(j, j+i):
                    tmp = min(tmp, countnum[k])
                ans += tmp * 3
                for k in range(j, j+i):
                    countnum[k] -= tmp
                    
        ans += sum(countnum)
    
        return ans
    
    print(solve(input()))