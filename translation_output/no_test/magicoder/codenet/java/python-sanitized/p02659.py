import sys

def main():
    a = int(sys.stdin.readline())
    b = float(sys.stdin.readline())
    bb = int((100 * b) + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()