import sys

def main():
    n = float(sys.stdin.readline())

    odd = 0
    not_odd = 0
    for i in range(1, int(n) + 1):
        if i % 2 == 0:
            not_odd += 1
        else:
            odd += 1
    print(odd / n)

if __name__ == "__main__":
    main()