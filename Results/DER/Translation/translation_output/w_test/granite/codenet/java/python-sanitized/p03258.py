MODULO = 100000007

def solve(s):
    n = len(s)
    if all(c == s[0] for c in s):
        return 1
    prefix_sum = [0] * (n + 1)
    for i in range(n):
        prefix_sum[i + 1] = prefix_sum[i] + (1 if s[i] == 'a' else 2)
        prefix_sum[i + 1] %= 3
    next_pos = [[n + 1] * 3 for _ in range(n + 2)]
    for i in range(n, -1, -1):
        for j in range(3):
            next_pos[i][j] = next_pos[i + 1][j]
        next_pos[i][prefix_sum[i]] = i
    ways = [0] * (n + 2)
    ways[0] = 1
    for i in range(n + 1):
        for j in range(1, 3):
            ways[next_pos[i][j]] += ways[i]
            ways[next_pos[i][j]] %= MODULO
    res = 0
    for i in range(1, n + 1):
        if prefix_sum[i] == prefix_sum[n]:
            res += ways[i]
            res %= MODULO
    return res