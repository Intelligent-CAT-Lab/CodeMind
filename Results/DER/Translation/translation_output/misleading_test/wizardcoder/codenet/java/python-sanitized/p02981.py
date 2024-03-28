import sys

def solve(n, a, b):
    return min(a * n, b)

def main():
    input = sys.stdin.readline().strip().split()
    n = int(input[0])
    a = int(input[1])
    b = int(input[2])
    output = solve(n, a, b)
    print(output)

if __name__ == '__main__':
    main()