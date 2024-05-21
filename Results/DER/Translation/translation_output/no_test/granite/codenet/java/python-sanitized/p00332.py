import sys

def solve(e, y):
    if e == 0:
        if 1868 <= y <= 1911:
            print("M" + str(y - 1867))
        elif 1912 <= y <= 1925:
            print("T" + str(y - 1911))
        elif 1926 <= y <= 1988:
            print("S" + str(y - 1925))
        else:
            print("H" + str(y - 1988))
    elif e == 1:
        print(1867 + y)
    elif e == 2:
        print(1911 + y)
    elif e == 3:
        print(1925 + y)
    elif e == 4:
        print(1988 + y)

def main():
    e, y = map(int, sys.stdin.readline().split())
    solve(e, y)

if __name__ == "__main__":
    main()