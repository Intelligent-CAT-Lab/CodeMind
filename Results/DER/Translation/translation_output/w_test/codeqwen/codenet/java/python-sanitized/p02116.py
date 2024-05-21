def main():
    str = input()
    if str == "":
        return
    else:
        res = int(str)
        han = 0
        ni_beki = 1
        ruijyo = 0
        while True:
            han = (res >> ruijyo) % 2
            if han == 0:
                res = (res % ni_beki) + 1
                break
            else:
                ni_beki = ni_beki * 2
                ruijyo += 1
        print(res)

if __name__ == "__main__":
    main()