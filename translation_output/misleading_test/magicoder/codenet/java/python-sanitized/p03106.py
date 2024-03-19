def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def main():
    A, B, K = map(int, input().split())
    s = []
    for i in range(1, min(A, B) + 1):
        if A % i == B % i == 0:
            s.append(i)
    print(s[-K])

if __name__ == "__main__":
    main()