import math

def factorial(n):
    return math.factorial(n)

def main():
    fact = 1
    for i in range(1, 1511):
        fact *= i
    fact += 2

    while True:
        n = int(input())
        print(fact)
        for i in range(2, 2 + n):
            print(i)

if __name__ == "__main__":
    main()