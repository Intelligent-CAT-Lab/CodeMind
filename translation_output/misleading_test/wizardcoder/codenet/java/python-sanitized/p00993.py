import math

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def main():
    fact = factorial(1510)
    fact += 2

    while True:
        try:
            n = int(input())
            print(fact)
            for i in range(2, 2+n):
                print(i)
        except EOFError:
            break

if __name__ == '__main__':
    main()