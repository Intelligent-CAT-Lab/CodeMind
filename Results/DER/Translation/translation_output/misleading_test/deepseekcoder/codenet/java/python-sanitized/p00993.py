import sys

def big_factorial(n):
    fact = 1
    for i in range(1, n + 1):
        fact *= i
    return fact + 2

def main():
    n = int(sys.stdin.readline().strip())
    fact = big_factorial(1510)
    print(fact)

    for i in range(2, 2 + n):
        print(i)

if __name__ == "__main__":
    main()