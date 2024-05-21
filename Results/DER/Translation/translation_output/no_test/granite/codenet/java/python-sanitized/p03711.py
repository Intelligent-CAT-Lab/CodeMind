import sys

def grouped(grp, x, y):
    bx = False
    by = False

    for i in range(len(grp)):
        if grp[i] == x:
            bx = True
        if grp[i] == y:
            by = True

    return bx and by

def main():
    sc = sys.stdin
    x = int(sc.readline())
    y = int(sc.readline())

    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]

    print("Yes" if (grouped(grp1, x, y) or grouped(grp2, x, y)) else "No")

if __name__ == "__main__":
    main()