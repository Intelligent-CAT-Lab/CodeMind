class main:
    import sys
    
    def find_solution(n):
        for i in range(1, 3510):
            for j in range(1, 3510):
                si = n * i * j
                bo = 4 * i * j - n * j - n * i
                if bo <= 0:
                    continue
                if si % bo == 0:
                    return i, j, si // bo
    
    n = int(sys.stdin.readline())
    i, j, k = find_solution(n)
    print(i, j, k)