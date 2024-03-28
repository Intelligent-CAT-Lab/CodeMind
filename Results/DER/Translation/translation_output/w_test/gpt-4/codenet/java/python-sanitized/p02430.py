from itertools import combinations

def solve(n, k):
    for combo in combinations(range(n), k):
        print(f"{sum(1<<i for i in combo)}: {' '.join(map(str, combo))}")

# Example test case
if __name__ == "__main__":
    n, k = map(int, input().split())
    solve(n, k)