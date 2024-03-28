import sys

def solve(s):
    return s.count('1')

def main():
    s = sys.stdin.readline().strip()
    print(solve(s))

if __name__ == "__main__":
    main()