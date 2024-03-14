import sys

def main():
    work = sys.stdin.readline().split()
    W, H, x, y, r = map(int, work)

    judge = "Yes" if 0 <= x - r and x + r <= W and 0 <= y - r and y + r <= H else "No"

    print(judge)

if __name__ == "__main__":
    main()