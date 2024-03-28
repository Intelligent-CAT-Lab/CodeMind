import math

def main():
    N = int(input())
    result = 0

    for i in range(1, N+1):
        for j in range(1, N+1):
            a = math.gcd(i, j)
            for k in range(1, N+1):
                result += math.gcd(a, k)
    print(result)

if __name__ == "__main__":
    main()