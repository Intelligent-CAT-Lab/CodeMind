import sys

def calc(num):
    n = float(num)
    sum = 0
    while num != 0:
        sum += num % 10
        num //= 10
    return n / sum if sum != 0 else 0

def main():
    K = int(sys.stdin.readline().strip())
    num = 0
    d = 1
    for _ in range(K):
        num += d
        if calc(num + 2 * d) < calc(num + d):
            d *= 10
        print(num)

if __name__ == "__main__":
    main()