import sys

def main():
    str = sys.stdin.readline().strip()

    if str == "":
        sys.exit(0)

    else:
        res = int(str)
        han = 0
        ni_beki = 1
        ruijyo = 0

        for i in range(1):
            han = (res >> ruijyo) & 1
            if han == 0:
                res = (res % ni_beki) + 1
                i = 1
                break
            else:
                ni_beki = ni_beki * 2
                ruijyo += 1

        print(res)

if __name__ == "__main__":
    main()