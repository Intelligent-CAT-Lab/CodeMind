def solve(a, l):
    if a % 2 == 0:
        for i in range(1, a // 2 + 1):
            for j in range(i + 1, a // 2 + 1):
                l.append(str(i) + " " + str(j))
                l.append(str(i) + " " + str(a + 1 - j))
                l.append(str(a + 1 - i) + " " + str(j))
                l.append(str(a + 1 - i) + " " + str(a + 1 - j))
    else:
        solve(a - 1, l)
        for i in range(1, a):
            l.append(str(a) + " " + str(i))

def main():
    a = int(input())
    l = []
    solve(a, l)
    print(len(l))
    for str in l:
        print(str)

if __name__ == "__main__":
    main()