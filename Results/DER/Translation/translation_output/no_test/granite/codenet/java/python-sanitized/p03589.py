import fractions

def solve():
    N = int(input())
    for h in range(1, 3501):
        for n in range(1, 3501):
            if 4 * h * n - N * n - N * h!= 0 and (N * h * n) % (4 * h * n - N * n - N * h) == 0:
                x = (N * h * n) // (4 * h * n - N * n - N * h)
                if x > 0:
                    print(h, n, x)
                    return

solve()