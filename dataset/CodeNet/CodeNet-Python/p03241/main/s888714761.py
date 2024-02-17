def make_divisors(n):
    divisors = []
    for i in range(1, int(n**0.5)+1):
        if n % i == 0:
            divisors.append(i)
            if i != n // i:
                divisors.append(n//i)

    # divisors.sort()
    return divisors

def main():
    N, M = list(map(int, input().split()))
    MN = M/N
    divisor = make_divisors(M)
    max_gcd = 0
    for d in divisor:
        if (d<=MN) and (d>=max_gcd):
            max_gcd = d
    print(max_gcd)
if __name__ == '__main__':
    main()