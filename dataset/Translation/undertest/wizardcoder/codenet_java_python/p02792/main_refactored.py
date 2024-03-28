class main:
    import math
    
    def count_digit(n):
        count = 0
        while n > 0:
            count += 1
            n //= 10
        return count
    
    def count_ways(n):
        count = 0
        for i in range(1, n+1):
            head = int(str(i)[0])
            tail = i % 10
            if tail == 0:
                continue
            count += count_ways(tail)
        return count
    
    n = int(input())
    keta = count_digit(n)
    result = count_ways(n)
    print(result)