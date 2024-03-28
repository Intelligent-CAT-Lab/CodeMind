class main:
    def solve(N):
        for h in range(1, 3501):
            for n in range(1, 3501):
                if (4*h*n - N*n - N*h) != 0 and (N*h*n) / (4*h*n - N*n - N*h) > 0 and (N*h*n) % (4*h*n - N*n - N*h) == 0:
                    return h, n, (N*h*n) / (4*h*n - N*n - N*h)
    
    N = int(input())
    h, n, m = solve(N)
    print(h, n, m)