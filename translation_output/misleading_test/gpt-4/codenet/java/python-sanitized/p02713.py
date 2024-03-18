def gcd(p, q):
    if p % q == 0:
        return q
    return gcd(q, p % q)

def main():
    N = int(input())
    result = 0
    a = 0

    for i in range(1, N+1):
        for j in range(1, N+1):
            a = gcd(i, j)
            for k in range(1, N+1):
                result += gcd(a, k)
    print(result)

if __name__ == "__main__":
    main()