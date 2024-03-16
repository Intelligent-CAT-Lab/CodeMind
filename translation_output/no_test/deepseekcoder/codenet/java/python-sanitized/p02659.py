import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = float(sys.stdin.readline().strip())
    bb = int((100 * b) + 0.5)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()