import math

def main(N):
    result = 0
    for i in range(1, N+1):
        for j in range(1, N+1):
            a = math.gcd(i, j)
            for k in range(1, N+1):
                result += math.gcd(a, k)
    return result

N = int(input())
print(main(N))