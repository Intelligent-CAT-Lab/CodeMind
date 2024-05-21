import sys

def main():
    x = list(map(int, sys.stdin.readline().split()))
    sum_x = sum(x)
    print(15 - sum_x)

if __name__ == "__main__":
    main()