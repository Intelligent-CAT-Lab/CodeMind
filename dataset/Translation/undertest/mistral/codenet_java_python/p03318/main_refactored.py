class main:
    import sys
    
    def calc(num):
        n = num
        sum = 0
        while n != 0:
            sum += n % 10
            n //= 10
        return n / sum
    
    K = int(input())
    num = 0
    d = 1
    for i in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)