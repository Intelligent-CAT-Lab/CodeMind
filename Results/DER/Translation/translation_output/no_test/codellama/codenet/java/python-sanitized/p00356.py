import math

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def main():
    x = int(input("Enter the first number: "))
    y = int(input("Enter the second number: "))
    p = 0
    a = x
    b = y
    while x % y != 0:
        z = x
        x = y
        y = z % y
    m = a + b - y

    if a % 2 == 0 or b % 2 == 0 or a == b or a % 2 > 0 and b % 2 > 0:
        print(m + 1)
    else:
        print(m)

if __name__ == "__main__":
    main()