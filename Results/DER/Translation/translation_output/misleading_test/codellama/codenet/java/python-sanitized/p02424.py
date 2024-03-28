import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(bin(a & b))
    print(bin(a | b))
    print(bin(a ^ b))

if __name__ == "__main__":
    main()