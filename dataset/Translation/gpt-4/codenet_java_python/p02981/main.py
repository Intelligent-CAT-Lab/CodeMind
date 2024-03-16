def solve(n, a, b):
    return min(a * n, b)

def main():
    n, a, b = map(int, input().split())
    print(solve(n, a, b))

if __name__ == "__main__":
    main()