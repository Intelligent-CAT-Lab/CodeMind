import sys

MOD = 10**9 + 7  # 10^9+7
MAX = 2**31 - 1  # intMax
INF = 10**9  # 10^9

def main():
    saori = sys.stdin.readline().strip()
    n = int(saori)
    if n < 1000:
        print("ABC")
    else:
        print("ABD")

if __name__ == "__main__":
    main()