def solve():
    n = int(input())
    ans = 0
    # 25 cents
    ans += n // 25
    n %= 25
    # 10 cents
    ans += n // 10
    n %= 10
    # 5 cents
    ans += n // 5
    n %= 5
    # 1 cent
    ans += n
    print(ans)

# <p02251 Method>
def out:
    def main():
        out = sys.stdout
        p02251().solve()
        out.flush()

    main()

# <Default Field>
maxInt = sys.maxsize
minInt = sys.minsize

# <Default Method>
def max(ar):
    return max(ar)

def min(ar):
    return min(ar)

def calcManhatDistance(x1, y1, x2, y2):
    return abs(x1 - x2) + abs(y1 - y2)

def calcEuclidDistance(x1, y1, x2, y2):
    return (x2 - x1) ** 2 + (y2 - y1) ** 2

def isPrime(n):
    if n == 2:
        return True
    if n < 2 or n % 2 == 0:
        return False
    d = int(n ** 0.5)
    for i in range(3, d + 1, 2):
        if n % i == 0:
            return False
    return True

def printChar2DArray(ar):
    for row in ar:
        print(" ".join(row))

# <Fast Sc