import math

N = int(input())

for h in range(1, 3501):
    for n in range(1, 3501):
        if 4 * h * n - N * n - N * h != 0 and (N * h * n) % (4 * h * n - N * n - N * h) == 0 and (N * h * n) / (4 * h * n - N * n - N * h) > 0:
            print(h, n, int((N * h * n) / (4 * h * n - N * n - N * h)))
            exit()