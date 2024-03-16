import sys

def main():
    n = int(sys.stdin.readline())
    s = " "
    for i in range(1, n + 1):
        s += str(i)
    print(s[n - 1])

if __name__ == "__main__":
    main()