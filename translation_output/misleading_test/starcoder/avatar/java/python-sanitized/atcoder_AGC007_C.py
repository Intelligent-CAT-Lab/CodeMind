import math

def main():
    N, d, x = map(float, input().split())
    ans = 0
    while N > 0.5:
        ans += (d + x * (N - 0.5))
        d = (N + 1) * d / N + (5 * x) / (2 * N)
        x = (1 + (2 / N)) * x
        N -= 1
    print(ans)

if __name__ == '__main__':
    main()