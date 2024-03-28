import sys

def grouped(grp, x, y):
    return x in grp and y in grp

def main():
    x, y = map(int, sys.stdin.readline().split())
    grp1 = [1, 3, 5, 7, 8, 10, 12]
    grp2 = [4, 6, 9, 11]
    grp3 = [2]
    if grouped(grp1, x, y) or grouped(grp2, x, y):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()