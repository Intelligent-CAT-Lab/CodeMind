import sys

def codeforces_669_A(n):
    if n == 2:
        return 1
    total = 0
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    return total

def main():
    n = int(input())
    result = codeforces_669_A(n)
    print(result)

if __name__ == "__main__":
    main()