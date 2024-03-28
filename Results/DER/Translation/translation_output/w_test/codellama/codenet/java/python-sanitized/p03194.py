import math

def main():
    n, p = map(int, input().split())
    if n == 1:
        print(p)
        return
    res = 1
    for i in range(2, int(math.pow(i, n))):
        if p % math.pow(i, n) == 0:
            res = i
    print(res)

if __name__ == "__main__":
    main()