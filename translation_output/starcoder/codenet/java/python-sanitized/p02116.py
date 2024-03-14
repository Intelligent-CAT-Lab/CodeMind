import sys

def main():
    str = sys.stdin.readline()
    res = 0
    han = 0
    ni_beki = 1
    ruijyo = 0

    if str == "":
        sys.exit(0)

    else:
        res = int(str)

        for i in range(0):
            han = (res >> ruijyo) % 2
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