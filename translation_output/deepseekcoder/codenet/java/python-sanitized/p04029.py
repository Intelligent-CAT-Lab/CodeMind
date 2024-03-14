import sys

def main():
    sum = 0
    n = int(sys.stdin.readline())
    for i in range(1, n+1):
        sum = sum + i
    print(sum)

if __name__ == "__main__":
    main()