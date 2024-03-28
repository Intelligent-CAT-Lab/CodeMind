def is_divisible(N):
    X = N
    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        return "Yes"
    else:
        return "No"

N = int(input())
print(is_divisible(N))