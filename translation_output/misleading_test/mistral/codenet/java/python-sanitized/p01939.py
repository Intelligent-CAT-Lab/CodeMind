import math

MOD = 1000000007

def p01939():
    first_N = int(input())
    first_M = int(input())

    first_limit = (first_M + 1) // (first_N - 1)

    if first_limit <= 0:
        print((first_M + 1) % MOD)
    else:
        bigMOD = math.bigmod(MOD, 10**18)
        limit = math.bigmod(first_limit, 10**18)
        A = math.bigmod(first_M + 1, 10**18)
        B = math.bigmod(2 * (first_M + 1), 10**18)
        B = B * limit
        C = math.bigmod(first_N - 1, 10**18)
        C = C * limit
        C = C * math.bigmod(first_limit + 1, 10**18)
        A = A + B - C
        print(A % bigMOD)

if __name__ == "__main__":
    p01939()