import sys

def solve(n, k):
    for bit in range(1 << n):
        if bin(bit).count('1')!= k:
            continue
        print(f"{bit}: {' '.join(map(str, [i for i in range(n) if bit & (1 << i)]))}")

def main():
    n, k = map(int, input().split())
    solve(n, k)

if __name__ == "__main__":
    sys.setrecursionlimit(10 ** 6)
    main()