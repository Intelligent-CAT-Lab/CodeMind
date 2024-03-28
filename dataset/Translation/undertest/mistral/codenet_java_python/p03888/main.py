import sys

def solve(r1, r2):
    return 1 / (1 / r1 + 1 / r2)

def main():
    for _ in range(int(input().strip())):
        r1, r2 = map(float, input().strip().split())
        ans = solve(r1, r2)
        print(f"{ans:.10f}")

if __name__ == "__main__":
    main()