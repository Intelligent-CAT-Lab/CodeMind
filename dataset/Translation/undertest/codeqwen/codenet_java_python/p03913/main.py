import math

def solver(n, a):
    ans = n
    for m in range(2, 41):
        c = int(math.pow(n, 1.0 / m))
        for i in range(max(c - 2, 2), c + 3):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            for j in range(m):
                res = a * (m - 1)
                res += j * i + (m - 1 - j) * (i + 1)
                den = math.pow(i, j) * math.pow(i + 1, m - 1 - j)
                res += (n + den - 1) / den
                ans = min(ans, res)
    return ans

def main():
    # t = time.time()
    n, a = map(int, input().split())
    print(solver(n, a))
    # print(time.time() - t)

if __name__ == "__main__":
    main()