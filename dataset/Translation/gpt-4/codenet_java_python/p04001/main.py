def main():
    S = input()
    if len(S) == 1:
        print(S)
        exit(0)

    N = [int(c) for c in S]

    pattern_count = 1
    tmp_bit = ""
    for i in range(len(N)):
        if i > 0:
            pattern_count *= 2
            tmp_bit += "1"

    sum = 0
    for i in range(pattern_count):
        binary = "{:b}".format(i).zfill(len(tmp_bit))
        add = str(N[0])
        for j in range(len(binary)):
            if binary[j] == '1':
                sum += int(add)
                add = ""
            add += str(N[j + 1])
        if add:
            sum += int(add)

    print(sum)

if __name__ == '__main__':
    main()