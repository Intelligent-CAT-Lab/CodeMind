MOD = 10**9 + 7

def ways_to_pair(x, memo_ways_to_pair):
    if memo_ways_to_pair[x] != -1:
        return memo_ways_to_pair[x]

    if x % 2 == 1:
        memo_ways_to_pair[x] = 0
    elif x == 0:
        memo_ways_to_pair[x] = 1
    else:
        memo_ways_to_pair[x] = (ways_to_pair(x - 2, memo_ways_to_pair) * (x - 1)) % MOD

    return memo_ways_to_pair[x]

def paired(f, x, y):
    return f[y] - f[x - 1]

def inside(a, x, y):
    return x <= a <= y

def calculate_dp(x, y, f, a, b, dp, k, memo_ways_to_pair):
    if dp[x][y] != -1:
        return dp[x][y]

    not_paired_in_xy = (y - x + 1) - paired(f, x, y)

    for i in range(1, k + 1):
        p1 = inside(a[i], x, y)
        p2 = inside(b[i], x, y)
        if p1 != p2:
            dp[x][y] = 0
            return dp[x][y]

    dp[x][y] = ways_to_pair(not_paired_in_xy, memo_ways_to_pair)

    for z in range(x + 1, y):
        not_paired_in_zy = (y - (z + 1) + 1) - paired(f, z + 1, y)
        dp[x][y] = (dp[x][y] - calculate_dp(x, z, f, a, b, dp, k, memo_ways_to_pair) * ways_to_pair(not_paired_in_zy, memo_ways_to_pair) + MOD * MOD) % MOD

    return dp[x][y]

def solve(n, k, a, b):
    n *= 2
    f = [0] * (n + 1)
    dp = [[-1] * (n + 1) for _ in range(n + 1)]
    memo_ways_to_pair = [-1] * (n + 1)

    for i in range(1, k + 1):
        f[a[i]] = 1
        f[b[i]] = 1

    for i in range(1, n + 1):
        f[i] += f[i - 1]

    result = 0
    for x in range(1, n + 1):
        for y in range(x, n + 1):
            not_paired_outside_xy = (n - (y - x + 1)) - (f[n] - paired(f, x, y))
            result = (result + calculate_dp(x, y, f, a, b, dp, k, memo_ways_to_pair) * ways_to_pair(not_paired_outside_xy, memo_ways_to_pair) % MOD) % MOD

    return result

# Sample test case
if __name__ == "__main__":
    input_data = input().split()
    n, k = int(input_data[0]), int(input_data[1])
    a, b = [0], [0]
    
    # Assuming that after entering the value for n and k, 
    # the pairs of a and b would be entered k times. 
    # This is just for this sample code to work, as the original code reads from a file or standard input.
    for i in range(k):
        a_val, b_val = map(int, input().split())
        a.append(a_val)
        b.append(b_val)

    print(solve(n, k, a, b))