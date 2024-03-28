import sys

def to_binary(n):
    binary = ""
    while n != 0:
        binary += str(n % 2)
        n //= 2
    return binary[::-1]

def main():
    a = int(input())
    b = int(input())
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))

if __name__ == "__main__":
    main()