import sys

N = int(sys.stdin.readline())
MOD = 1000000007
TOKENS = ["A", "C", "G", "T"]
memo = [{} for _ in range(N + 1)]


def is_ok(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        vals = list(last4)
        vals[i], vals[i + 1] = vals[i + 1], vals[i]
        s = "".join(vals)
        if "AGC" in s:
            return False
    return True


def dfs(current, last3):
    if last3 in memo[current]:
        return memo[current][last3]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if is_ok(last3 + c):
            result = (result + dfs(current + 1, last3[1:] + c)) % MOD
    memo[current][last3] = result
    return result


print(dfs(0, "TTT"))