import sys

def p02116():
    try:
        str = input()
        res = int(str)

        han = 0
        ni_beki = 1
        ruijyo = 0

        if str == "":
            sys.exit(0)

        else:
            for i in range(1):
                han = (res >> ruijyo) % 2
                if han == 0:
                    res = (res % ni_beki) + 1
                    i = 1
                    break
                else:
                    ni_beki = ni_beki * 2
                    ruijyo += 1

            print(res)

    except ValueError:
        print("Invalid input")

if __name__ == "__main__":
    p02116()