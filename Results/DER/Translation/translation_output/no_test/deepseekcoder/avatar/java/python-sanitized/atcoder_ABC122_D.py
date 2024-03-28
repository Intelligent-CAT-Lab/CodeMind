import sys

MOD = 1000000007
TOKENS = ["A", "C", "G", "T"]

def isOK(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        lst = list(last4)
        lst[i], lst[i+1] = lst[i+1], lst[i]
        s = "".join(lst)
        if "AGC" in s:
            return False
    return True

def dfs(current, last3, memo):
    if last3 in memo[current]:
        return memo[current][last3]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if isOK(last3[-2:] + c):
            result = (result + dfs(current + 1, last3[1:] + c, memo)) % MOD
    memo[current][last3] = result
    return result

def calc():
    N = int(sys.stdin.readline().strip())
    memo = [{} for _ in range(N + 1)]
    return dfs(0, "TTT", memo)

if __name__ == "__main__":
    print(calc())