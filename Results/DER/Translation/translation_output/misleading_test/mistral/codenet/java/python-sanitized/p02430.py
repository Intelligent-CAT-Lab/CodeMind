import sys

def solve(n, k):
    for bit in range(1 << n):
        if len(set(bit)) == k:
            print(f"{bit}:", end="")
            for j in range(n):
                if (bit >> j) & 1:
                    print(f" {j}", end="")
            print()

if __name__ == "__main__":
    n, k = map(int, sys.stdin.readline().strip().split())
    solve(n, k)