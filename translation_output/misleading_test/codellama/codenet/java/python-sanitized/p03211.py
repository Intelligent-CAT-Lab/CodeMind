import math

def solve(S):
    min_diff = 1000
    for i in range(len(S) - 2):
        X = int(S[i:i+3])
        diff = math.fabs(X - 753)
        min_diff = min(min_diff, diff)
    return min_diff

S = "1234567876"
print(solve(S))