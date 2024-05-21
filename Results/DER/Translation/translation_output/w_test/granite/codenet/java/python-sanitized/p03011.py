import sys

def main():
    P, Q, R = map(int, sys.stdin.readline().split())
    max_value = max(P, Q, R)
    print(max_value)

if __name__ == "__main__":
    main()