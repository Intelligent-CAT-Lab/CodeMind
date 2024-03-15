import sys

def main():
    sc = sys.stdin
    a = int(sc.readline())
    b = float(sc.readline())
    c = int(round(b * 100))
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()