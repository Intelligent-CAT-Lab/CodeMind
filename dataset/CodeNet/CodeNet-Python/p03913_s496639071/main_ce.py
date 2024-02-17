import math
def main():
    N, A = map(int, "8 1".split())
    ans = float("inf")
    for i in range(41):
        x = int(math.pow(N, 1/(i+1)))
        k = 0
        while x**(i+1-k) * (x+1)**k < N:
            k += 1
        y = x * (i+1-k) + (x+1) * k + A * i
        ans = min(ans, y)
    print(ans)
if __name__ == "__main__":
    main()
