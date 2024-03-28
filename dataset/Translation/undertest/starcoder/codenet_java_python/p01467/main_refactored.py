class main:
    import sys
    
    def main():
        a = [int(x) for x in sys.stdin.readline().split()]
        b = [int(x) for x in sys.stdin.readline().split()]
        k = int(sys.stdin.readline())
        max = 0
        for i in range(1<<10):
            if bin(i).count('1') > k:
                continue
            borrow = [0]*11
            c = [0]*10
            for j in range(10):
                if a[j] - borrow[j] >= b[j]:
                    c[j] = a[j] - borrow[j] - b[j]
                    borrow[j+1] = 0
                else:
                    c[j] = a[j] - borrow[j] + 10 - b[j]
                    borrow[j+1] = (i&(1<<j)) > 0? 0 : 1
            ans = 0
            for j in range(10):
                ans = ans*10 + c[j]
            max = max if max > ans else ans
        print(max)
    
    if __name__ == '__main__':
        main()