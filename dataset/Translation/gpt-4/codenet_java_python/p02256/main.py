import math

def main():
    input_str = input().split(" ")
    a = int(input_str[0])
    b = int(input_str[1])

    print(gcd(a, b))

def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

if __name__ == "__main__":
    main()