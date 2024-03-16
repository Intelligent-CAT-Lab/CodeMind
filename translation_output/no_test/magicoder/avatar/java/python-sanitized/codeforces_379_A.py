import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    res = a

    while a >= b:
        res += a // b
        a = a // b + a % b

    print(res)

if __name__ == "__main__":
    main()