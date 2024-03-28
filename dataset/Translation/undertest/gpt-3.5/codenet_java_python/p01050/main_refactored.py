class main:
    def main():
        s = input()
        sd = "abcdefghijklmnopqrstuvwxyz"
        sdnum = "0123456789"
        count = [0] * 26
        countnum = [0] * 10
    
        for i in range(len(s)):
            if s[i].isdigit():
                countnum[int(s[i])] += 1
            if s[i].isalpha():
                count[ord(s[i]) - ord('a')] += 1
    
        ans = 0
        for i in range(26, 2, -1):
            for j in range(0, 26 - i + 1):
                tmp = 10000
                for k in range(j, j + i):
                    tmp = min(tmp, count[k])
                ans += tmp * 3
                for k in range(j, j + i):
                    count[k] -= tmp
    
        ans += sum(count)
    
        for i in range(10, 2, -1):
            for j in range(0, 10 - i + 1):
                tmp = 10000
                for k in range(j, j + i):
                    tmp = min(tmp, countnum[k])
                ans += tmp * 3
                for k in range(j, j + i):
                    countnum[k] -= tmp
    
        ans += sum(countnum)
    
        print(ans)
    
    
    if __name__ == "__main__":
        main()