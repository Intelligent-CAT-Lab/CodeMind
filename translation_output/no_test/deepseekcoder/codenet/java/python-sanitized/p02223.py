import sys

def main():
    N = int(sys.stdin.readline().strip())
    if N == 1:
        print(1)
        print("0")
    elif N == 2:
        print(2)
        print("0")
        print("11")
    else:
        print(N - 1)
        for i in range(2, N + 1):
            s = '1' * i
            print(s[0] + '0' + s[1:])

if __name__ == "__main__":
    main()