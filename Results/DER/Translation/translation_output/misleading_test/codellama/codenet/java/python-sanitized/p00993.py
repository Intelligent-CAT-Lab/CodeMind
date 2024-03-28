import math

def main():
    fact = 1
    mul = 1
    for i in range(1, 1510):
        fact = fact * mul
        mul = mul + 1
    fact = fact + 2

    while True:
        n = int(input())
        print(fact)
        for i in range(2, 2 + n):
            print(i)

if __name__ == "__main__":
    main()