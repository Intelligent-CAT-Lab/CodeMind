def main():
    x = input()

    c = 0
    len = 0
    for i in x:
        if i == 'T':
            c -= 1
        else:
            if c < 0:
                len -= c
                c = 1
            else:
                c += 1

    len += abs(c)
    print(len)

if __name__ == '__main__':
    main()