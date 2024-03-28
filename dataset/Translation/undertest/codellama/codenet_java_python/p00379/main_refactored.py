class main:
    import math
    
    def solve(a, n, m):
        max_value = int(math.pow(m, 1 / n))
        count = 0
        for i in range(1, max_value + 1):
            x = int(math.pow(i, n))
            str_x = str(x)
            y = 0
            for j in range(len(str_x)):
                y += int(str_x[j])
            if y + a == i:
                count += 1
        return count
    
    a = 16
    n = 2
    m = 1000
    print(solve(a, n, m))