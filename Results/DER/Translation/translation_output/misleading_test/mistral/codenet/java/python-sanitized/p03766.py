import sys

def f(n, freq, memo):
    if n > 0:
        if freq[n] != -1:
            return freq[n]
        elif n == 1:
            return 0
        else:
            return memo[n] = max(f(n-1, freq, memo) + memo[n-2], memo[n-1] + n)
    else:
        return 0

def suffix(n, freq, memo):
    if n > 0:
        if freq[n] != -1:
            return freq[n]
        elif n == 1:
            return 0
        else:
            return memo[n] = max(suffix(n-1, freq, memo) + memo[n-2], memo[n-1] + n)
    else:
        return 0

def solve(n, freq):
    memo = [0] * (n+1)
    f