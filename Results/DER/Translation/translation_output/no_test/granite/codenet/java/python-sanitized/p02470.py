import math

def totient(n):
    phi = [i for i in range(1, n + 1)]
    for i in range(2, n + 1):
        if phi[i - 1] == i:
            for j in range(i, n + 1, i):
                phi[j - 1] = phi[j - 1] // i * (i - 1)
    return phi[n - 1]

n = int(input())
print(totient(n))