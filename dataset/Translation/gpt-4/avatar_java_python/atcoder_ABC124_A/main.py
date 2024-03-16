def solve(a, b):
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

if __name__ == "__main__":
    a, b = map(int, input().split())
    print(solve(a, b))