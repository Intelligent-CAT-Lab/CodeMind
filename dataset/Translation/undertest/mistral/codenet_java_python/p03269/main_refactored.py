class main:
    import sys
    
    def p03269():
        l = int(input())
        k = l
        t = 1
        count = 1
        ans = []
        while l > 1:
            if (l & 1) == 1:
                k -= t
                ans.append(str(count) + " " + "20" + " " + str(k))
            ans.append(str(count) + " " + (count + 1) + " " + str(t))
            count += 1
            l >>= 1
            t *= 2
        print(20 + " " + (len(ans) + 19))
        for i in range(19):
            print(str(i + 1) + " " + str(i + 2) + " " + "0")
        for s in ans:
            print(s)
    
    if __name__ == "__main__":
        p03269()