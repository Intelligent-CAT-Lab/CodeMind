# Function to calculate the minimum number of operations
def calc(n, memo):
    if n == 0:
        return 0
    if memo[n] != -1:
        return memo[n]

    res = n
    pow6 = 1
    while pow6 <= n:
        res = min(res, calc(n - pow6, memo) + 1)
        pow6 *= 6

    pow9 = 1
    while pow9 <= n:
        res = min(res, calc(n - pow9, memo) + 1)
        pow9 *= 9

    memo[n] = res
    return memo[n]

#