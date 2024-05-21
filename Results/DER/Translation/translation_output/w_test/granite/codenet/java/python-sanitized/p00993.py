import math

def fact(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

def main():
    n = int(input())
    fact_value = fact(1510) + 2
    print(fact_value)
    for i in range(2, 2 + n):
        print(i)

if __name__ == "__main__":
    main()