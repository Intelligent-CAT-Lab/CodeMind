import sys

def solve(e, y):
    if e == 0:
        if 1868 <= y <= 1911:
            return "M" + str(y - 1867)
        elif 1912 <= y <= 1925:
            return "T" + str(y - 1911)
        elif 1926 <= y <= 1988:
            return "S" + str(y - 1925)
        else:
            return "H" + str(y - 1988)
    elif e == 1:
        return str(1867 + y)
    elif e == 2:
        return str(1911 + y)
    elif e == 3:
        return str(1925 + y)
    elif e == 4:
        return str(1988 + y)

def main():
    e, y = map(int, sys.stdin.readline().split())
    print(solve(e, y))

if __name__ == "__main__":
    main()