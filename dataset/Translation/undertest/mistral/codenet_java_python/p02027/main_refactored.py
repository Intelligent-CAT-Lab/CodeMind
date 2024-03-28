class main:
    from collections import defaultdict
    
    def p02027(n, k):
        dp = defaultdict(lambda: defaultdict(long))
        total = 0
        for i in range(1, int(1 << k) + 1):
            total += search(i, k - 1, n)
        return total
    
    def search(num, count, max):
        if count == 0:
            return 1
        if dp[(num, count)]:
            return dp[(num, count)]
        total = 0
        for i in range(2, int(num * 2 ** (count - 1)) + 1):
            total += search(num * i, count - 1, max)
        dp[(num, count)] = total
        return total
    
    n = int(input())
    k = int(input())
    print(p02027(n, k))