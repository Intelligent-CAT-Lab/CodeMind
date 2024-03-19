import sys

def main():
    x = list(map(int, sys.stdin.readline().split()))
    sum = 0
    for i in range(5):
        sum += x[i]
    print(15 - sum)

if __name__ == "__main__":
    main()