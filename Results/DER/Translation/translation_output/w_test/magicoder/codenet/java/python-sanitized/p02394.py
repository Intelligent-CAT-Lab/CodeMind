import sys

def main():
    work = sys.stdin.readline().split()
    W, H, x, y, r = map(int, work)

    if (x-r) >= 0 and (x+r) <= W:
        if ((y-r) >= 0 and (y+r) <= H):
            judge = "Yes"
        else:
            judge = "No"
    else:
        judge = "No"

    print(judge)

if __name__ == "__main__":
    main()