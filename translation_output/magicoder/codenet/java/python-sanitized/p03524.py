import sys

def main():
    S = sys.stdin.readline().strip()
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')
    if max(a, b, c) - min(a, b, c) <= 1:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()