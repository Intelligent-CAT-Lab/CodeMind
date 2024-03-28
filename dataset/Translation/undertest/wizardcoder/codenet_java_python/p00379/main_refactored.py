class main:
    import math
    
    def count_numbers(a, n, m):
        max_num = int(math.pow(m, 1/n))
        count = 0
        for i in range(1, max_num+1):
            x = int(math.pow(i, n))
            y = sum(int(digit) for digit in str(x))
            if y + a == i:
                count += 1
        return count
    
    a, n, m = map(int, input().split())
    print(count_numbers(a, n, m))