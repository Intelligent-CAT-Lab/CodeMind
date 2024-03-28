import math

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n-1)

def main():
    fact = factorial(1510)
    mul = 1
    for i in range(1, 1510):
        fact = fact * mul
        mul = mul + 1
    fact = fact + 2

    while True:
        n = int(input("Enter a number: "))
        print(fact)
        for i in range(2, 2 + n):
            print(i)

if __name__ == "__main__":
    main()