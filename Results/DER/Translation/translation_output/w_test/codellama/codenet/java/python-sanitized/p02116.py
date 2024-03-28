import sys

def main():
    input_str = sys.stdin.readline().strip()
    if not input_str:
        sys.exit(0)
    res = int(input_str)
    han = 0
    ni_beki = 1
    ruijyo = 0
    while han == 0:
        han = (res >> ruijyo) % 2
        if han == 0:
            res = (res % ni_beki) + 1
            break
        else:
            ni_beki *= 2
            ruijyo += 1
    print(res)

if __name__ == "__main__":
    main()