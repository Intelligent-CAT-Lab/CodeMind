import math

def factorial(n):
    result = 1
    for i in range(2, n+1):
        result *= i
    return result

def main():
    n = int(input("Enter a number: "))
    fact = factorial(n)
    print(fact)
    for i in range(2, n+2):
        print(i)

if __name__ == "__main__":
    main()