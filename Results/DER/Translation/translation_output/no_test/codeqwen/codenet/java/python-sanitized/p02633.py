import sys

MOD = 10**9 + 7  # 10^9+7
MAX = 2**31 - 1  # intMax
INF = 10**9  # 10^9

def main():
    saori = sys.stdin.readline().strip()
    n = int(saori)
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            return
        i += 1

if __name__ == "__main__":
    main()