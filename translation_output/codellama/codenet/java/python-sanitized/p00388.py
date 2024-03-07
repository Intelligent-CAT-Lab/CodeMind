import math

def solve(H, A, B):
    ans = 0
    for i in range(A, B+1):
        if H % i == 0:
            ans += 1
    return ans

H = int(input())
A = int(input())
B = int(input())
print(solve(H, A, B))