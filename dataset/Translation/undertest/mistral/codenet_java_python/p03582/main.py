def solve():
    a = [int(x) for x in input().split()]
    s = ['a' + str(i) for i in range(len(a))]
    s = sorted(s)
    for i in range(len(s) - 1):
        s[i], s[-i - 1] = s[-i - 1] + s[i], s[i]
    print(s[0])

if __name__ == '__main__':
    solve()