import sys

def count_divisors(n):
    count = 0
    for i in range(1, n + 1):
        if n % i == 0:
            count += 1
    return count

def main():
    n = int(sys.stdin.readline())
    ans = 0
    for i in range(1, n + 1):
        if i % 2 == 1:
            if count_divisors(i) == 8:
                ans += 1
    print(ans)

if __name__ == "__main__":
    main()