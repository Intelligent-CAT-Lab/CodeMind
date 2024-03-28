import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    kuti = 1
    tap = 0

    while kuti < b:
        kuti = kuti - 1 + a
        tap += 1

    print(tap)

if __name__ == "__main__":
    main()