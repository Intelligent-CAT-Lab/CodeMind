import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def main():
    N = int(input())
    result = 0

    for i in range(1, N + 1):
        for j in range(1, N + 1):
            a = gcd(i, j)
            for k in range(1, N + 1):
                result += gcd(a, k)
    
    print(result)

if __name__ == "__main__":
    main()