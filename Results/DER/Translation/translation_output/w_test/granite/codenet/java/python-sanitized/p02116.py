import sys

def main():
    n = int(sys.stdin.readline())
    res = 0
    han = 0
    ni_beki = 1
    ruijyo = 0

    while True:
        han = (n >> ruijyo) % 2
        if han == 0:
            res = (n % ni_beki) + 1
            break
        else:
            ni_beki *= 2
            ruijyo += 1

    print(res)

if __name__ == "__main__":
    main()