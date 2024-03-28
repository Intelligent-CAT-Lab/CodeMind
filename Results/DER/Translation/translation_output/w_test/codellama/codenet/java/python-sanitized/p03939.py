import math

def main():
    N, d1, x = map(int, input().split())
    ans = 0
    for i in range(N):
        ans += d1 + (i + 0.5) * x
        d1 = (2 * i + 2) * d1 + 5 * x / (2 * i)
        x = (i + 2) / i * x
    print(ans)

if __name__ == "__main__":
    main()