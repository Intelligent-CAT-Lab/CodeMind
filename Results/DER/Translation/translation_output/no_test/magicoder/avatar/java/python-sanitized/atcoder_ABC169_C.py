import sys

def main():
    a = int(sys.stdin.readline())
    b = float(sys.stdin.readline())
    c = round(b * 100)
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()