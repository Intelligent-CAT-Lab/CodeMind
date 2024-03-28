def solve(a, b):
    if a == b:
        return a * 2
    else:
        return max(a, b) * 2 - 1

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(solve(a, b))