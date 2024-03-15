import sys

def main():
    a = int(input())
    b = int(input())
    n = b - a
    print(n * (n + 1) // 2 - b)

if __name__ == "__main__":
    main()