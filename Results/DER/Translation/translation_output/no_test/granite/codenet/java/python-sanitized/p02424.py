import sys

def main():
    a, b = map(int, sys.stdin.read().split())
    print(to_binary(a & b))
    print(to_binary(a | b))
    print(to_binary(a ^ b))

def to_binary(x):
    return ''.join(str(x & 1) for _ in range(32))[::-1]

if __name__ == '__main__':
    main()