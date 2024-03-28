class main:
    import sys
    
    def main():
        n = int(sys.stdin.readline())
        k = n
        t = 1
        count = 1
        ans = []
        while n > 1:
            if n & 1 == 1:
                k -= t
                ans.append(str(count) + " " + str(20) + " " + str(k))
            ans.append(str(count) + " " + str(count + 1) + " " + str(t))
            count += 1
            n >>= 1
            t *= 2
        print(20, len(ans) + 19)
        for i in range(19):
            print(i + 1, i + 2, 0)
        for a in ans:
            print(a)
    
    if __name__ == "__main__":
        main()