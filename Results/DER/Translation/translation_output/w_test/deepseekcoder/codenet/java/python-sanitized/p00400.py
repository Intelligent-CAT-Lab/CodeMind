import sys

def main():
    N = ord(sys.stdin.readline().strip())
    r = 0
    if 65 <= N <= 90:
        r = 1
    elif 97 <= N <= 122:
        r = 2
    print(r)

if __name__ == "__main__":
    main()