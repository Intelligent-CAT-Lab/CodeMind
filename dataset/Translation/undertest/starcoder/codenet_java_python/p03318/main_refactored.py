class main:
    import sys
    
    K = int(sys.stdin.readline())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)
    
    def calc(num):
        n = float(num)
        sum = 0
        while num!= 0:
            sum += num % 10
            num //= 10
        return n / sum