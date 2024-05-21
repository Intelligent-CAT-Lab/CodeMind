import sys

def main():
    t, s, q = map(int, sys.stdin.readline().split())
    count = 0
    while s < t:
        s *= q
        count += 1
    print(count)

if __name__ == "__main__":
    main()