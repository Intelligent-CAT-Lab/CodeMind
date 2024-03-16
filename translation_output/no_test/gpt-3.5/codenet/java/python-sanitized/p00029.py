def main():
    s = []
    index = 0
    while True:
        try:
            str = input()
            s.append(str)
            index += 1
        except EOFError:
            break

    r = [0] * index
    flag = [True] * 2002
    fre=0
    for i in range(index):
        for j in range(i+1, index):
            if s[i] == s[j] and flag[j] == True:
                r[i] += 1
                flag[j] = False

    max = 0
    maxin = 0
    for i in range(index):
        if max < r[i]:
            max = r[i]
            maxin = i

    print(s[maxin], end=' ')
    max = 0
    for i in range(index):
        if len(s[max]) < len(s[i]):
            max = i

    print(s[max])

if __name__ == "__main__":
    main()