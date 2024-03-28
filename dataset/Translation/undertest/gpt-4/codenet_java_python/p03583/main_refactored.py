class main:
    def p03583(n):
        # a
        for i in range(1, 3510):
            # b
            for j in range(1, 3510):
                si = n * i * j
                bo = 4 * i * j - n * j - n * i
                if bo <= 0:
                    continue
                if si % bo == 0:
                    return (i, j, si // bo)
    
    # Sample test case
    n = int(input())
    result = p03583(n)
    print(result[0], result[1], result[2])