def extended_euclidean(a, b):
    if a == 0:
        return (b, 0, 1)
    else:
        gcd, x, y = extended_euclidean(b % a, a)
        return (gcd, y - (b // a) * x, x)

def main():
    a, b = map(int, input().split())
    gcd, x, y = extended_euclidean(a, b)
    print(x, y)

if __name__ == "__main__":
    main()