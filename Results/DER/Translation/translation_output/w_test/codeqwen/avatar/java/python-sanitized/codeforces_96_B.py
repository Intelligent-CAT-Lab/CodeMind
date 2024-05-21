def main():
    number = int(input())
    ans = -1
    value = 0
    mask = 2

    while value < number:
        s = bin(mask)[2:]
        zeros = s.count('0')

        if zeros != s.count('1'):
            mask += 1
            continue

        s = s.replace('0', '4')
        s = s.replace('1', '7')
        value = int(s, 2)

    print(value)

if __name__ == "__main__":
    main()