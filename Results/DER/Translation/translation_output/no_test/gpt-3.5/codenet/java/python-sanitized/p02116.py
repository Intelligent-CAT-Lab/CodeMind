import sys

def main():
    str = input()

    try:
        res = int(str)
        han = 0
        ni_beki = 1
        ruijyo = 0

        if str == "":
            sys.exit(0)
        else:
            while True:
                han = (res >> ruijyo) % 2
                if han == 0:
                    res = (res % ni_beki) + 1
                    break
                else:
                    ni_beki *= 2
                    ruijyo += 1

            print(res)

    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()